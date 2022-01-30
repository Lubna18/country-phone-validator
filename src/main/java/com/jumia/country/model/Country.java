package com.jumia.country.model;

import java.util.Objects;

public class Country {

    private String countryName;
    private String countryCode;
    private String codeRegex;

    public Country(String countryName, String countryCode, String codeRegex) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.codeRegex = codeRegex;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCodeRegex() {
        return codeRegex;
    }

    public void setCodeRegex(String codeRegex) {
        this.codeRegex = codeRegex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(getCountryName(), country.getCountryName()) && Objects.equals(getCountryCode(), country.getCountryCode()) && Objects.equals(getCodeRegex(), country.getCodeRegex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryName(), getCountryCode(), getCodeRegex());
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", codeRegex='" + codeRegex + '\'' +
                '}';
    }
}
