package com.employee.portal.EmployeeDto;

public class CompaniesDto {
    private String companyName;
    private String address;
    private String contact;

    public CompaniesDto() {
    }

    public CompaniesDto(String companyName, String address, String contact) {
        this.companyName = companyName;
        this.address = address;
        this.contact = contact;
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
