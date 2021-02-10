package com.hazebyte.stock.model.yahoo;

import com.hazebyte.stock.model.Quote;

public class YahooQuote implements Quote {
    private YahooQuoteResponse quoteResponse;

    @Override
    public YahooQuoteResult[] getQuotes() {
        return quoteResponse.result;
    }

    @Override
    public String toString() {
        return "YahooQuote{" +
                "quoteResponse=" + quoteResponse +
                '}';
    }

}
