package com.mohitgupta.sainsburyscraper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

@Component
public class ScraperGateway {

	public Document getDocument(String sainburyWebsiteUrl) throws IOException {
		return Jsoup.connect(sainburyWebsiteUrl).get();
	}

}
