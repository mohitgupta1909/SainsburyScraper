package com.mohitgupta.sainsburyscraper;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GroceryItemPageProcessor {
	
	private final static Logger logger = Logger.getLogger(GroceryItemPageProcessor.class);

	public GroceryItem extract(String productUrl) {

		try {
			logger.debug("Grocery Item Url: " + productUrl);

			Document doc = Jsoup.connect(productUrl).get();

			Element productContainerElement = doc.select("div.productTitleDescriptionContainer").first();
			if (productContainerElement == null) {
				throw new ScraperException("Cannot find productTitleDescriptionContainer element");
			}

			Element titleElement = productContainerElement.getElementsByTag("h1").first();
			String title = titleElement.text();
			float size = doc.toString().length() / 1024;

			Element pricePerUnitElement = doc.select("p.pricePerUnit").first();
			if (pricePerUnitElement == null) {
				throw new ScraperException("Cannot find pricePerUnit element");
			}
			String pricePerUnit = pricePerUnitElement.text().replace("/unit", "").replace("£", "");
			float unitPrice = Float.parseFloat(pricePerUnit);

			Element productDescriptionElement = doc.select("div.productText").first();
			if (productDescriptionElement == null) {
				throw new ScraperException("Cannot find pricePerUnit element");
			}

			String description = productDescriptionElement.text();

			logger.debug(String.format("Title: %s, Description: %s, Size: %s, Unit Price: %s", title, description, size,
					unitPrice));

			return new GroceryItem(title, description, size, unitPrice);
		} catch (IOException ex) {
			throw new ScraperException("Cannot connect to " + productUrl, ex);
		}
	}

}
