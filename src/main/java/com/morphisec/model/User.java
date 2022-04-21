package com.morphisec.model;

import com.morphisec.enums.Country;

public class User {
    private String firstName;
    private String lastName;
    private Country country;

    public User(String firstName, String lastName, Country country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User: {" +
                "firstName=\"" + firstName + '"' +
                ", lastName=\"" + lastName + '"' +
                ", country=" + country +
                ", country-code=" + country.getCountryCode() +
                ", country-language='" + country.getLanguage() + "'" +

                '}';
    }

    public String toJson() {
        return "{ \n" +
                "\tfirstName=\"" + firstName + "\", \n" +
                "\tlastName=\"" + lastName + "\"\n" +
                "\tcountry: " + country.toJson() + "\n" +
                '}';
    }
}
