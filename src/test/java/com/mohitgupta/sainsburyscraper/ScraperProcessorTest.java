package com.mohitgupta.sainsburyscraper;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ScraperProcessorTest {
	
	@Mock
	GroceryItemPageProcessor groceryItemPageProcessor;
	
	@Mock
	ScraperGateway scraperGateway;
	
	@InjectMocks
	ScraperProcessor scraperProcessor;
	
	@Test
	public void testProcess() throws IOException {
		when(scraperGateway.getDocument(eq("https://www.testurl.test/test"))).thenReturn(getMockedPage());
		when(groceryItemPageProcessor.extract(anyString())).thenReturn(new GroceryItem("Test", "Test 01", 1.1f, 2.76f));
		String actual = scraperProcessor.process("https://www.testurl.test/test");
		assertNotNull(actual);
		assertTrue(actual.length() > 0);
		assertTrue(actual.contains("Test"));
		assertTrue(actual.contains("Test 01"));
		assertTrue(actual.contains("\"total\": 30.36"));
	}
	
	private Document getMockedPage() throws IOException {
		InputStream is = ScraperProcessorTest.class.getResourceAsStream("/mocksitepage.html");
		byte[] buffer = new byte[is.available()];
		is.read(buffer);
		is.close();
		String html = new String(buffer);
		return Jsoup.parse(html);
	}
}
