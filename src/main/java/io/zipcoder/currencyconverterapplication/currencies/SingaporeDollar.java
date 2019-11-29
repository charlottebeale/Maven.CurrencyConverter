package io.zipcoder.currencyconverterapplication.currencies;
import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;

public class SingaporeDollar implements ConvertableCurrency {
    @Override
    public CurrencyType getEnumType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}
