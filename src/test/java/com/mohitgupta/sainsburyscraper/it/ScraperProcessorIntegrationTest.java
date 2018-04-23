package com.mohitgupta.sainsburyscraper.it;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mohitgupta.sainsburyscraper.ScraperMain;
import com.mohitgupta.sainsburyscraper.ScraperProcessor;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ScraperMain.class)
public class ScraperProcessorIntegrationTest {

	@Autowired
	private ScraperProcessor processor;
	
	@Test
	public void testValidUrl() {
		String json = processor.process("https://www.sainsburys.co.uk/webapp/wcs/stores/servlet/CategoryDisplay?listView=true&orderBy=FAVOURITES_FIRST&parent_category_rn=12518&top_category=12518&langId=44&beginIndex=0&pageSize=20&catalogId=10137&searchTerm=&categoryId=185749&listId=&storeId=10151&promotionId=#langId=44&storeId=10151&catalogId=10137&categoryId=185749&parent_category_rn=12518&top_category=12518&pageSize=20&orderBy=FAVOURITES_FIRST&searchTerm=&beginIndex=0&hideFilters=true");
		assertTrue(!json.isEmpty());
	}

	@Test
	public void testTotalUnitPrice() {
		String json = processor.process(
				"https://www.sainsburys.co.uk/webapp/wcs/stores/servlet/CategoryDisplay?listView=true&orderBy=FAVOURITES_FIRST&parent_category_rn=12518&top_category=12518&langId=44&beginIndex=0&pageSize=20&catalogId=10137&searchTerm=&categoryId=185749&listId=&storeId=10151&promotionId=#langId=44&storeId=10151&catalogId=10137&categoryId=185749&parent_category_rn=12518&top_category=12518&pageSize=20&orderBy=FAVOURITES_FIRST&searchTerm=&beginIndex=0&hideFilters=true");
		assertTrue(json.contains("total") && json.contains("results"));
	}

}
