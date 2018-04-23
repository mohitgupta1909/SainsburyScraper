package com.mohitgupta.sainsburyscraper;

import static org.junit.Assert.assertEquals;
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
public class GroceryItemPageProcessorTest {

	@Mock
	ScraperGateway scraperGateway;
	
	@InjectMocks
	GroceryItemPageProcessor groceryItemPageProcessor;
	
	
	@Test
	public void testProcess() throws IOException {
		when(scraperGateway.getDocument(eq("https://www.testurl.test/test"))).thenReturn(getMockedPage());
		GroceryItem actual = groceryItemPageProcessor.extract("https://www.testurl.test/test");
		assertNotNull(actual);
		assertEquals("Sainsbury's Avocado, Ripe & Ready x2", actual.getTitle());
		assertEquals("Avocados", actual.getDescription());
		assertEquals(new Float(1.9f), new Float(actual.getUnitPrice()));				
		assertEquals(new Float(50.0f), new Float(actual.getSize()));
		
	}
	
	private Document getMockedPage() throws IOException {
		InputStream is = ScraperProcessorTest.class.getResourceAsStream("/onegroceryitem.html");
		byte[] buffer = new byte[is.available()];
		is.read(buffer);
		is.close();
		String html = new String(buffer);
		return Jsoup.parse(html);
	}
}
