package com.hazebyte.stonk.model.yahoo;

import java.util.Arrays;

public class YahooQuoteResponse {
    protected YahooQuoteResult[] result;

    @Override
    public String toString() {
        return "YahooQuoteResponse{" +
                "result=" + Arrays.toString(result) +
                '}';
    }
}
