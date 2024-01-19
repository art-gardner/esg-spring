package com.example.addresses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Address {

    @Id
    @GeneratedValue
    Long CustomerRef;
    String CustomerName;
    String AddressLineOne;
    String AddressLineTwo;
    String Town;
    String County;
    String Country;
    String Postcode;

    Address() {}
    Address(Long customerRef, String customerName, String addressLineOne, String addressLineTwo, String town, String county, String country, String postcode) {
        CustomerRef = customerRef;
        CustomerName = customerName;
        AddressLineOne = addressLineOne;
        AddressLineTwo = addressLineTwo;
        Town = town;
        County = county;
        Country = country;
        Postcode = postcode;
    }

    public Long getCustomerRef() {
        return CustomerRef;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getAddressLineOne() {
        return AddressLineOne;
    }

    public String getAddressLineTwo() {
        return AddressLineTwo;
    }

    public String getTown() {
        return Town;
    }

    public String getCounty() {
        return County;
    }

    public String getCountry() {
        return Country;
    }

    public String getPostcode() {
        return Postcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(CustomerRef, address.CustomerRef) && Objects.equals(CustomerName, address.CustomerName) && Objects.equals(AddressLineOne, address.AddressLineOne) && Objects.equals(AddressLineTwo, address.AddressLineTwo) && Objects.equals(Town, address.Town) && Objects.equals(County, address.County) && Objects.equals(Country, address.Country) && Objects.equals(Postcode, address.Postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CustomerRef, CustomerName, AddressLineOne, AddressLineTwo, Town, County, Country, Postcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "CustomerRef='" + CustomerRef + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", AddressLineOne='" + AddressLineOne + '\'' +
                ", AddressLineTwo='" + AddressLineTwo + '\'' +
                ", Town='" + Town + '\'' +
                ", County='" + County + '\'' +
                ", Country='" + Country + '\'' +
                ", Postcode='" + Postcode + '\'' +
                '}';
    }
}
