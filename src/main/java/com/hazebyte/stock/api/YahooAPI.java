package com.hazebyte.stock.api;

import com.google.gson.Gson;
import com.hazebyte.stock.http.Request;
import com.hazebyte.stock.http.Response;
import com.hazebyte.stock.model.yahoo.YahooQuote;
import com.hazebyte.stock.http.HttpClient;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class YahooAPI implements StockAPI {
    private HttpClient httpClient;

    private final String API_LINK = "https://query1.finance.yahoo.com/v7/finance";

    private String lang = "en-US";

    private String region = "US";

    private final String corsDomain = "finance.yahoo.com";

    public YahooAPI() {
        httpClient = new HttpClient();
    }

    @Override
    public YahooQuote getQuoteFromSymbol(String symbol) throws IOException {
        String link = String.format("%s/quote?lang=%s&region=%s&corsDomain=%s&symbols=%s", API_LINK, lang, region, corsDomain, symbol);
        URL url = new URL(link);
        Request request = Request.builder()
                .url(url)
                .get();

        Response response = httpClient.call(request);

        Gson gson = new Gson();
        Object obj = gson.fromJson(response.getBody(), YahooQuote.class);

        YahooQuote quote = (YahooQuote) obj;
        return quote;
    }

    @Override
    public YahooQuote getQuoteFromSymbols(String[] symbols) throws IOException {
        return getQuoteFromSymbol(String.join(",", symbols));
    }
}
