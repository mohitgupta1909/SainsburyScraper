# SainsburyScraper

## 1. Clone the project

Use following commands to clone the project

```
git clone https://github.com/mohitgupta1909/SainsburyScraper.git
```

Go to your project directory. For example:

```
cd SainsburyScraper
```

## 2. Build the project

Use following command to build the project

```
mvn clean install
```
 

## 3. Run Tests

Use following command to run the tests

```
mvn test
```

## 4. Run the application

Use following command to run the project using command line:

```
java -jar target/sainsbury-scraper-1.0-SNAPSHOT.jar
```

You should be able to see following result at the end:

```
$ java -jar target/sainsbury-scraper-1.0-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.5.RELEASE)

2018-04-23 13:30:04.557  INFO 45910 --- [           main] c.m.sainsburyscraper.ScraperMain         : Starting ScraperMain v1.0-SNAPSHOT on C02VD4J9HV2LMBP with PID 45910 (/Users/kabiliravi/git/SainsburyScraper/target/sainsbury-scraper-1.0-SNAPSHOT.jar started by kabiliravi in /Users/kabiliravi/git/SainsburyScraper)
2018-04-23 13:30:04.560  INFO 45910 --- [           main] c.m.sainsburyscraper.ScraperMain         : No active profile set, falling back to default profiles: default
2018-04-23 13:30:04.625  INFO 45910 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@4b9af9a9: startup date [Mon Apr 23 13:30:04 EDT 2018]; root of context hierarchy
2018-04-23 13:30:05.206  INFO 45910 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-04-23 13:30:05.219  INFO 45910 --- [           main] c.m.sainsburyscraper.ScraperProcessor    : Process starts ... https://www.sainsburys.co.uk/webapp/wcs/stores/servlet/CategoryDisplay?listView=true&orderBy=FAVOURITES_FIRST&parent_category_rn=12518&top_category=12518&langId=44&beginIndex=0&pageSize=20&catalogId=10137&searchTerm=&categoryId=185749&listId=&storeId=10151&promotionId=#langId=44&storeId=10151&catalogId=10137&categoryId=185749&parent_category_rn=12518&top_category=12518&pageSize=20&orderBy=FAVOURITES_FIRST&searchTerm=&beginIndex=0&hideFilters=true
2018-04-23 13:30:12.198  INFO 45910 --- [           main] c.m.sainsburyscraper.ScraperProcessor    : Process ends
2018-04-23 13:30:12.208  INFO 45910 --- [           main] c.m.sainsburyscraper.ScraperMain         :
{
  "results": [
    {
      "title": "Sainsbury's Avocado, Ripe & Ready x2",
      "description": "Avocados",
      "size": 53.0,
      "unitPrice": 1.9
    },
    {
      "title": "Sainsbury's Conference Pears, Ripe & Ready x4",
      "description": "Conference",
      "size": 47.0,
      "unitPrice": 1.95
    },
    {
      "title": "Sainsbury's Mango, Ripe & Ready x2",
      "description": "by Sainsbury's Ripe and Ready Mango",
      "size": 48.0,
      "unitPrice": 1.85
    },
    {
      "title": "Sainsbury's Kiwi Fruit, Ripe & Ready x4",
      "description": "Kiwi",
      "size": 48.0,
      "unitPrice": 1.75
    },
    {
      "title": "Sainsbury's Kiwi Fruit, SO Organic x4",
      "description": "Organic Kiwi",
      "size": 48.0,
      "unitPrice": 1.35
    },
    {
      "title": "Sainsbury's Pears, Ripe & Ready x4",
      "description": "Pear",
      "size": 47.0,
      "unitPrice": 1.95
    },
    {
      "title": "Sainsbury's Ripe & Ready Plums x5",
      "description": "Plums",
      "size": 48.0,
      "unitPrice": 2.0
    },
    {
      "title": "Sainsbury's Tree Ripened Papaya Each",
      "description": "Papaya",
      "size": 47.0,
      "unitPrice": 1.5
    },
    {
      "title": "Sainsbury's White Flesh Nectarines, Ripe & Ready x4",
      "description": "by Sainsbury's Ripe and Ready White Flesh Nectarines",
      "size": 47.0,
      "unitPrice": 3.0
    },
    {
      "title": "Sainsbury's Avocados, Ripe & Ready x4",
      "description": "Avocados",
      "size": 48.0,
      "unitPrice": 2.9
    },
    {
      "title": "Sainsbury's Ripe & Ready Extra Large Avocados Each",
      "description": "Avocados",
      "size": 48.0,
      "unitPrice": 1.75
    }
  ],
  "total": 21.9
}
2018-04-23 13:30:12.211  INFO 45910 --- [           main] c.m.sainsburyscraper.ScraperMain         : Started ScraperMain in 8.041 seconds (JVM running for 8.508)
2018-04-23 13:30:12.211  INFO 45910 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@4b9af9a9: startup date [Mon Apr 23 13:30:04 EDT 2018]; root of context hierarchy
2018-04-23 13:30:12.212  INFO 45910 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
```

