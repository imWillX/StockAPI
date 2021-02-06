package com.hazebyte.stock.api;

import com.hazebyte.stock.model.Quote;
import com.hazebyte.stock.model.yahoo.YahooQuote;

import java.io.IOException;

public interface StockAPI {

    /**
     * Returns a quote from a symbol.
     * @param symbol the symbol of the stock e.g. GME.
     * @return {@link YahooQuote}.
     */
    Quote getQuoteFromSymbol(String symbol) throws IOException;

    /**
     * Returns a quote for the specified symbols.
     * @param symbols the symbol of the stock e.g. ["GME", "GM"];
     * @return the quotes for the following symbols.
     * @throws IOException
     */
    Quote getQuoteFromSymbols(String[] symbols) throws IOException;
}
