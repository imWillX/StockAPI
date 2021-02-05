package com.hazebyte.stock.model.yahoo;

import com.hazebyte.stock.model.QuoteResult;

public class YahooQuoteResult implements QuoteResult {
    public String language;
    public String region;
    public String quoteType;
    public String quoteSourceName;
    public boolean triggerable;
    public String currency;
    public double regularMarketPrice;
    public double regularMarketDayHigh;
    public String regularMarketDayRange;
    public double regularMarketDayLow;
    public long regularMarketVolume;
    public double regularMarketOpen;
    public double regularMarketPreviousClose;
    public String fullExchangeName;
    public String financialCurrency;
    public long averageDailyVolume3Month;
    public long averageDailyVolume10Day;
    public double fiftyTwoWeekLowChange;
    public double fiftyTwoWeekLowChangePercent;
    public String fiftyTwoWeekRange;
    public double fiftyTwoWeekHighChange;
    public double fiftyTwoWeekHighChangePercent;
    public double fiftyTwoWeekLow;
    public double fiftyTwoWeekHigh;
    public long dividendDate;
    public long sharesOutstanding;
    public double bookValue;
    public double fiftyDayAverage;
    public double fiftyDayAverageChange;
    public double fiftyDayAverageChangePercent;
    public double twoHundredDayAverage;
    public double twoHundredDayAverageChange;
    public double twoHundredDayAverageChangePercent;
    public long marketCap;
    public double forwardPE;
    public double priceToBook;
    public long firstTradeDateMilliseconds;
    public double postMarketChangePercent;
    public long postMarketTime;
    public double postMarketPrice;
    public double postMarketChange;
    public double regularMarketChange;
    public double regularMarketChangePercent;
    public long regularMarketTime;
    public String exchange;
    public String shortName;
    public String longName;
    public String exchangeTimezoneName;
    public String exchangeTimezoneShortName;
    public String market;
    public boolean esgPopulated;
    public boolean tradeable;
    public String marketState;
    public String displayName;
    public String symbol;

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getStockName() {
        return longName;
    }

    @Override
    public String getStockAltName() {
        return shortName;
    }

    @Override
    public String getExchange() {
        return exchange;
    }

    @Override
    public String getFullExchangeName() {
        return fullExchangeName;
    }

    @Override
    public String getExchangeTimezone() {
        return exchangeTimezoneShortName;
    }

    @Override
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @Override
    public String getMarketState() {
        return marketState;
    }

    @Override
    public double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @Override
    public double getRegularMarketChange() {
        return regularMarketChange;
    }

    @Override
    public double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @Override
    public long getPostMarketTime() {
        return postMarketTime;
    }

    @Override
    public double getPostMarketPrice() {
        return postMarketPrice;
    }

    @Override
    public double getPostMarketChange() {
        return postMarketChange;
    }

    @Override
    public String toString() {
        return "YahooQuoteResult{" +
                "language='" + language + '\'' +
                ", region='" + region + '\'' +
                ", quoteType='" + quoteType + '\'' +
                ", quoteSourceName='" + quoteSourceName + '\'' +
                ", triggerable=" + triggerable +
                ", currency='" + currency + '\'' +
                ", regularMarketPrice=" + regularMarketPrice +
                ", regularMarketDayHigh=" + regularMarketDayHigh +
                ", regularMarketDayRange='" + regularMarketDayRange + '\'' +
                ", regularMarketDayLow=" + regularMarketDayLow +
                ", regularMarketVolume=" + regularMarketVolume +
                ", regularMarketOpen=" + regularMarketOpen +
                ", regularMarketPreviousClose=" + regularMarketPreviousClose +
                ", fullExchangeName='" + fullExchangeName + '\'' +
                ", financialCurrency='" + financialCurrency + '\'' +
                ", averageDailyVolume3Month=" + averageDailyVolume3Month +
                ", averageDailyVolume10Day=" + averageDailyVolume10Day +
                ", fiftyTwoWeekLowChange=" + fiftyTwoWeekLowChange +
                ", fiftyTwoWeekLowChangePercent=" + fiftyTwoWeekLowChangePercent +
                ", fiftyTwoWeekRange='" + fiftyTwoWeekRange + '\'' +
                ", fiftyTwoWeekHighChange=" + fiftyTwoWeekHighChange +
                ", fiftyTwoWeekHighChangePercent=" + fiftyTwoWeekHighChangePercent +
                ", fiftyTwoWeekLow=" + fiftyTwoWeekLow +
                ", fiftyTwoWeekHigh=" + fiftyTwoWeekHigh +
                ", dividendDate=" + dividendDate +
                ", sharesOutstanding=" + sharesOutstanding +
                ", bookValue=" + bookValue +
                ", fiftyDayAverage=" + fiftyDayAverage +
                ", fiftyDayAverageChange=" + fiftyDayAverageChange +
                ", fiftyDayAverageChangePercent=" + fiftyDayAverageChangePercent +
                ", twoHundredDayAverage=" + twoHundredDayAverage +
                ", twoHundredDayAverageChange=" + twoHundredDayAverageChange +
                ", twoHundredDayAverageChangePercent=" + twoHundredDayAverageChangePercent +
                ", marketCap=" + marketCap +
                ", forwardPE=" + forwardPE +
                ", priceToBook=" + priceToBook +
                ", firstTradeDateMilliseconds=" + firstTradeDateMilliseconds +
                ", postMarketChangePercent=" + postMarketChangePercent +
                ", postMarketTime=" + postMarketTime +
                ", postMarketPrice=" + postMarketPrice +
                ", postMarketChange=" + postMarketChange +
                ", regularMarketChange=" + regularMarketChange +
                ", regularMarketChangePercent=" + regularMarketChangePercent +
                ", regularMarketTime=" + regularMarketTime +
                ", exchange='" + exchange + '\'' +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                ", exchangeTimezoneName='" + exchangeTimezoneName + '\'' +
                ", exchangeTimezoneShortName='" + exchangeTimezoneShortName + '\'' +
                ", market='" + market + '\'' +
                ", esgPopulated=" + esgPopulated +
                ", tradeable=" + tradeable +
                ", marketState='" + marketState + '\'' +
                ", displayName='" + displayName + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
