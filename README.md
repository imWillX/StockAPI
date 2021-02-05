# StonkAPI

StonkAPI is a java API that tracks stock positions.

## Install

Install this API to use in your personal projects.

### Build

```
git@github.com:imWillX/StonkAPI.git
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
            <groupId>com.hazebyte.stonk</groupId>
            <artifactId>stonkapi</artifactId>
            <version>1.0.0</version>
        </dependency>
```

## Usage

```
StonkAPI api = new YahooAPI();
Quote quote = api.getQuoteFromSymbol("GME");
QuoteResult result = quote.getQuotes()[0];

result.getSymbol(); // GME
result.getRegularMarketPrice(); // $ $
```