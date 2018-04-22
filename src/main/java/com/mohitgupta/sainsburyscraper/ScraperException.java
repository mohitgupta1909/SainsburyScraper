package com.mohitgupta.sainsburyscraper;

public class ScraperException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ScraperException() {
	}

	public ScraperException(String message, Throwable cause) {
		super(message, cause);
	}

	public ScraperException(String message) {
		super(message);
	}

	public ScraperException(Throwable cause) {
		super(cause);
	}

}
