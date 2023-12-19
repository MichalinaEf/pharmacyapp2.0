package com.michalinaef.pharmacyapp.dto;

public class PharmacyDTO {

    private String name;
    private ContactDetailsDTO contactDetails;

    public PharmacyDTO(String name, ContactDetailsDTO contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactDetailsDTO getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsDTO contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "PharmacyDTO{" +
                "name='" + name + '\'' +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
