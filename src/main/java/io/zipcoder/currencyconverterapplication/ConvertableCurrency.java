package io.zipcoder.currencyconverterapplication;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getEnumType().getRate();
    }
    CurrencyType getEnumType();
}
