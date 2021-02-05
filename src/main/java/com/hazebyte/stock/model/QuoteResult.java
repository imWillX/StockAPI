package com.hazebyte.stock.model;

public interface QuoteResult {

    String getSymbol();

    String getCurrency();

    String getDisplayName();

    String getStockName();

    String getStockAltName();

    String getExchange();

    String getFullExchangeName();

    String getExchangeTimezone();

    String getExchangeTimezoneName();

    String getMarketState();

    double getRegularMarketPrice();

    double getRegularMarketChange();

    double getRegularMarketChangePercent();

    long getPostMarketTime();

    double getPostMarketPrice();

    double getPostMarketChange();
}
