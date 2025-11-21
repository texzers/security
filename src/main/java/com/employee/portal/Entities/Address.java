package com.employee.portal.Entities;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int doorNo;

    public Address() {
    }

    public Address(int doorNo, String street, String area, int pinCode) {
        this.doorNo = doorNo;
        this.street = street;
        this.area = area;
        this.pinCode = pinCode;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    private String street;
    private String area;
    private int pinCode;

}
