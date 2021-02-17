package com.appslab.springbootapp.Address;
import com.appslab.springbootapp.Company.Company;

import javax.persistence.*;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String street;
    private int zipCode;
    private String city;
    private String state;

    public Address(){
    }

    public Address(Long id, String street, int zipCode, String city, String state) {
        this.id = id;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }
    @OneToOne(mappedBy = "address")
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
