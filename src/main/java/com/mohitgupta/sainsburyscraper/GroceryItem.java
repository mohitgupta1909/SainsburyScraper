package com.mohitgupta.sainsburyscraper;

public class GroceryItem {

	private String title;
	private String description;
	private float size;
	private float unitPrice;

	public GroceryItem() {
	}

	public GroceryItem(String title, String description, float size, float unitPrice) {
		this.title = title;
		this.description = description;
		this.size = size;
		this.unitPrice = unitPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

}
