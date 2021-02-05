package com.hazebyte.stonk.model.yahoo;

import com.hazebyte.stonk.model.Quote;
import com.hazebyte.stonk.model.QuoteResult;

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
