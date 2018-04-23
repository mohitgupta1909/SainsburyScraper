package com.mohitgupta.sainsburyscraper.it;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mohitgupta.sainsburyscraper.GroceryItem;
import com.mohitgupta.sainsburyscraper.GroceryItemPageProcessor;
import com.mohitgupta.sainsburyscraper.ScraperMain;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ScraperMain.class)
public class GroceryItemPageProcessorIntegrationTest {

	@Autowired
	GroceryItemPageProcessor processor;
	
	@Test
	public void testGroceryItemData() {
		String url = "https://www.sainsburys.co.uk/shop/gb/groceries/ripe---ready/sainsburys-avocado--ripe---ready-x2";

		GroceryItem groceryItem = processor.extract(url);

		assertNotNull(groceryItem);
		assertNotNull(groceryItem.getTitle());

		assertNotNull(groceryItem.getDescription());
		assertTrue(groceryItem.getDescription().length() > 0);

		assertTrue(groceryItem.getSize() > 0);
		assertTrue(groceryItem.getUnitPrice() == 1.9f);

	}

}
