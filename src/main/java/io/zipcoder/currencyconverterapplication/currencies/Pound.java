package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

public class Pound implements ConvertableCurrency {
    @Override
    public CurrencyType getEnumType() {
        return CurrencyType.POUND;
    }
}
