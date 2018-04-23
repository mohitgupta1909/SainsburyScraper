package com.mohitgupta.sainsburyscraper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScraperMain implements CommandLineRunner {

	private final static Logger logger = Logger.getLogger(ScraperMain.class);

	private static final String DEFAULT_SAINSBURY_URL = "https://www.sainsburys.co.uk/webapp/wcs/stores/servlet/CategoryDisplay?listView=true&orderBy=FAVOURITES_FIRST&parent_category_rn=12518&top_category=12518&langId=44&beginIndex=0&pageSize=20&catalogId=10137&searchTerm=&categoryId=185749&listId=&storeId=10151&promotionId=#langId=44&storeId=10151&catalogId=10137&categoryId=185749&parent_category_rn=12518&top_category=12518&pageSize=20&orderBy=FAVOURITES_FIRST&searchTerm=&beginIndex=0&hideFilters=true";

	public static final void main(String[] args) {
		SpringApplication app = new SpringApplication(ScraperMain.class);
 		app.run(args);
	}
	
	@Autowired
	private ScraperProcessor scraper;

	@Override
	public void run(String... args) throws Exception {
		String sainburyWebsiteUrl = DEFAULT_SAINSBURY_URL;

		if (args.length > 1) {
			sainburyWebsiteUrl = args[0];
		}
		logger.info("\n" + scraper.process(sainburyWebsiteUrl));
	}
	
}
