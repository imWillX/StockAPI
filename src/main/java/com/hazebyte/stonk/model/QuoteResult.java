package com.hazebyte.stonk.model;

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

    double getRegularMarketPrice();

    double getRegularMarketChange();

    double getRegularMarketChangePercent();
}
