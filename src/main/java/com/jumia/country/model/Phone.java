package com.jumia.country.model;

import java.util.Objects;

public class Phone {

    private String phoneNumber;
    private String country;
    private String valid;
    private String countryCode;

    public Phone(String phoneNumber, String country, String valid, String countryCode) {
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.valid = valid;
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getPhoneNumber(), phone.getPhoneNumber()) && Objects.equals(getCountry(), phone.getCountry()) && Objects.equals(getValid(), phone.getValid()) && Objects.equals(getCountryCode(), phone.getCountryCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber(), getCountry(), getValid(), getCountryCode());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", country='" + country + '\'' +
                ", valid='" + valid + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
