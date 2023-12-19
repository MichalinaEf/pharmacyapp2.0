package com.michalinaef.pharmacyapp.dto;

public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private ContactDetailsDTO contactDetails;

    public UserDTO(String firstName, String lastName, String userName, String password, ContactDetailsDTO contactDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.contactDetails = contactDetails;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ContactDetailsDTO getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsDTO contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", contactDetails=" + contactDetails +
                '}';
    }
}
