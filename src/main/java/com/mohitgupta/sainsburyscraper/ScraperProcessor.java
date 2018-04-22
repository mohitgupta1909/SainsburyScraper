package com.mohitgupta.sainsburyscraper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ScraperProcessor {

	private final static Logger logger = Logger.getLogger(ScraperProcessor.class);

	private String sainsburyUrl;
	
	private GroceryItemPageProcessor groceryItemPageProcessor;

	public ScraperProcessor(String sainsburyUrl) {
		this.sainsburyUrl = sainsburyUrl;
		this.groceryItemPageProcessor = new GroceryItemPageProcessor();
	}

	public String process() {

		validateUrl();

		try {

			logger.info("Process starts ... " + this.sainsburyUrl);

			Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

			Document doc = Jsoup.connect(this.sainsburyUrl).get();

			Elements linkElements = doc.select("a[href*=groceries/ripe]");

			float totalPrice = 0.0f;
			List<GroceryItem> groceryItems = new ArrayList<GroceryItem>();

			for (Element element : linkElements) {
				String productUrl = element.attr("abs:href");
				GroceryItem groceryItem = groceryItemPageProcessor.extract(productUrl);
				groceryItems.add(groceryItem);
				totalPrice += groceryItem.getUnitPrice();
			}

			logger.info("Process ends");

			Map<String, Object> jsonResponse = new LinkedHashMap<String, Object>();
			jsonResponse.put("results", groceryItems);
			jsonResponse.put("total", totalPrice);

			return gson.toJson(jsonResponse);

		} catch (IOException ex) {
			throw new ScraperException("Cannot connect to " + this.sainsburyUrl, ex);
		}
	}

	private void validateUrl() {
		try {
			new URL(this.sainsburyUrl);
		} catch (MalformedURLException ex) {
			throw new ScraperException("Invalid Sainsbury Website Url", ex);
		}
	}


}
