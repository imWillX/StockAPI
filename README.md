# StockAPI

StockAPI is a java API that tracks stock positions.

## Install

Install this API to use in your personal projects.

### Build

```
git@github.com:imWillX/StockAPI.git
cd StockAPI
mvn install
```

### Maven

Currently, repositories is not supported and the build step is required.
Feel free to leave suggestions in our issue tracker.

```
<repositories>
</repositories>
```

To use in your local project, add this to your `pom.xml`.

```
        <dependency>
            <groupId>com.hazebyte.stock</groupId>
            <artifactId>stockapi</artifactId>
            <version>1.0.0</version>
        </dependency>
```

## Usage

```
StockAPI api = new YahooAPI();
Quote quote = api.getQuoteFromSymbol("GME");
QuoteResult result = quote.getQuotes()[0];

result.getSymbol(); // GME
result.getRegularMarketPrice(); // $$
```
