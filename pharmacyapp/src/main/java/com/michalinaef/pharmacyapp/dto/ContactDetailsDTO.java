package com.michalinaef.pharmacyapp.dto;

public class ContactDetailsDTO {

    private String Street;
    private String houseNo;
    private String postalCode;
    private String city;
    private String phoneNo;
    private String email;

    public ContactDetailsDTO(String street, String houseNo, String postalCode,
                             String city, String phoneNo, String email) {
        Street = street;
        this.houseNo = houseNo;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetailsDTO{" +
                "Street='" + Street + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
