package com.course.selenium.common;

public class Address {

    private String alias;
    private String firstName;
    private String lastName;
    private String company;
    private String vatNumber;
    private String address;
    private String addressComplement;
    private String city;
    private String postalCode;
    private String country;
    private String phoneNumber;

    public Address(String alias, String firstName, String lastName, String company, String vatNumber, String address, String addressComplement, String city, String postalCode, String country, String phoneNumber){
        this.alias = alias;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.vatNumber = vatNumber;
        this.address = address;
        this.addressComplement = addressComplement;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }


    public String getAlias() {
        return alias;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
