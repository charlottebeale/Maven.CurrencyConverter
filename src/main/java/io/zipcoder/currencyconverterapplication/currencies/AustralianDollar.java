package io.zipcoder.currencyconverterapplication.currencies;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

public class AustralianDollar implements ConvertableCurrency {
    @Override
    public CurrencyType getEnumType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}