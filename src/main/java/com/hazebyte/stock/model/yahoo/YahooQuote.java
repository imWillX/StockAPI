package com.hazebyte.stock.model.yahoo;

import com.hazebyte.stock.model.Quote;
import com.hazebyte.stock.model.QuoteResult;

public class YahooQuote implements Quote {
    private YahooQuoteResponse quoteResponse;

    public QuoteResult[] getQuotes() {
        return quoteResponse.result;
    }

    @Override
    public String toString() {
        return "YahooQuote{" +
                "quoteResponse=" + quoteResponse +
                '}';
    }

}
