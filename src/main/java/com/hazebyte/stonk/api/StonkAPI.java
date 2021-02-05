package com.hazebyte.stonk.api;

import com.hazebyte.stonk.model.yahoo.YahooQuote;

import java.io.IOException;

public interface StonkAPI {

    /**
     * Returns a quote from a symbol.
     * @param symbol the symbol of the stock e.g. GME.
     * @return {@link YahooQuote}.
     */
    YahooQuote getQuoteFromSymbol(String symbol) throws IOException;

    /**
     * Returns a quote for the specified symbols.
     * @param symbols the symbol of the stock e.g. ["GME", "GM"];
     * @return the quotes for the following symbols.
     * @throws IOException
     */
    YahooQuote getQuoteFromSymbols(String[] symbols) throws IOException;
}
