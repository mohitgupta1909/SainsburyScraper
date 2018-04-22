package com.mohitgupta.sainsburyscraper;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GroceryItemPageProcessorTest {

	@Test
	public void testGroceryItemData() {
		String url = "https://www.sainsburys.co.uk/shop/gb/groceries/ripe---ready/sainsburys-avocado--ripe---ready-x2";

		GroceryItemPageProcessor processor = new GroceryItemPageProcessor();
		GroceryItem groceryItem = processor.extract(url);

		assertNotNull(groceryItem);
		assertNotNull(groceryItem.getTitle());

		assertNotNull(groceryItem.getDescription());
		assertTrue(groceryItem.getDescription().length() > 0);

		assertTrue(groceryItem.getSize() > 0);
		assertTrue(groceryItem.getUnitPrice() == 1.9f);

	}

	@Test
	public void testDescriptionValue() {

		String url = "https://www.sainsburys.co.uk/shop/gb/groceries/ripe---ready/sainsburys-avocado--ripe---ready-x2";

		GroceryItemPageProcessor processor = new GroceryItemPageProcessor();
		GroceryItem groceryItem = processor.extract(url);

		assertTrue(groceryItem.getDescription().contains("Avocado"));
	}
}
