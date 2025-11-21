package com.employee.portal.EmployeeDto;

public class AddressDto {
    private int doorNo;
    private String companyName;
    private String address;
    private String contact;

    public AddressDto() {
    }

    public AddressDto(int doorNo, String companyName, String address, String contact) {
        this.doorNo = doorNo;
        this.companyName = companyName;
        this.address = address;
        this.contact = contact;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
