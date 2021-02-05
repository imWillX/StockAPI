package com.hazebyte.stonk.api;

import com.hazebyte.stonk.model.Quote;
import com.hazebyte.stonk.model.QuoteResult;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class YahooAPITest {

    @Test
    public void getQuoteFromSymbol() throws IOException {
        String symbol = "GME";

        StonkAPI api = new YahooAPI();
        Quote quote = api.getQuoteFromSymbol(symbol);

        QuoteResult result = quote.getQuotes()[0];

        assertEquals(symbol, result.getSymbol());
    }


    @Test
    public void getQuoteFromSymbols() throws IOException {
        String[] symbols = {"GME", "GM"};

        StonkAPI api = new YahooAPI();
        Quote quote = api.getQuoteFromSymbols(symbols);

        QuoteResult gmeResult = quote.getQuotes()[0];
        QuoteResult gmResult = quote.getQuotes()[1];

        assertEquals(symbols[0], gmeResult.getSymbol());
        assertEquals(symbols[1], gmResult.getSymbol());
    }
}