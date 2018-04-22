# SainsburyScraper

## Build the project

Use following command to build the project

```
mvn clean install
```

This command generates two jar files:

One is sainsbury-scraper-1.0-SNAPSHOT-shaded.jar which is jar file with all dependencies and required classes in a single jar and the other one is sainsbury-scraper-1.0-SNAPSHOT.jar which you need to provide the other dependencies in class-path.
 

## Run Tests

Use following command to run the tests

```
mvn test
```

## Run the application

Use following command to run the project using command line:

```
java -jar target/sainsbury-scraper-1.0-SNAPSHOT-shaded.jar
```

You should be able to see following result at the end:

```
...
2018-04-22 19:25:05,098 [main] INFO  com.mohitgupta.sainsburyscraper.ScraperProcessor - Process ends
2018-04-22 19:25:05,104 [main] INFO  com.mohitgupta.sainsburyscraper.ScraperMain -
{
  "results": [
    {
      "title": "Sainsbury's Avocado, Ripe & Ready x2",
      "description": "Avocados",
      "size": 52.0,
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
      "title": "Sainsbury's Nectarines, Ripe & Ready x4",
      "description": "Description Yellow Flesh Nectarines Sweet & juicy Ripe & ready 1 of 5 a day One nectarine counts as 1 of your 5 a-day Aim for at least 5 different portions of fruit or veg a day. Fresh, frozen, dried, canned and juice all count. We value the quality of fresh fruit and vegetables We are proud to work in partnership with our suppliers, who participate in an independent audit programme that ensures responsible pesticide usage and encourages environmental protection and wildlife conservation. Class I",
      "size": 50.0,
      "unitPrice": 3.0
    },
    {
      "title": "Sainsbury's Kiwi Fruit, Ripe & Ready x4",
      "description": "Kiwi",
      "size": 49.0,
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
      "title": "Sainsbury's Tree Ripened Papaya Each",
      "description": "Papaya",
      "size": 47.0,
      "unitPrice": 1.5
    },
    {
      "title": "Sainsbury's Avocados, Ripe & Ready x4",
      "description": "Avocados",
      "size": 47.0,
      "unitPrice": 2.9
    },
    {
      "title": "Sainsbury's Ripe & Ready Extra Large Avocados Each",
      "description": "Avocados",
      "size": 48.0,
      "unitPrice": 1.75
    }
  ],
  "total": 19.9
}
```

