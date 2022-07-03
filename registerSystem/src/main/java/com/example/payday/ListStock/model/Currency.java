package com.example.payday.ListStock.model;

public enum Currency {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR"),
    GPB("GPB"),
    HKD("HKD"),
    CHF("CHF"),
    JPY("JPY"),
    CNY("CNY"),
    TRY("TRY");

    private String currency;

    Currency(String currency) {
        this.currency = currency;
    }
}
