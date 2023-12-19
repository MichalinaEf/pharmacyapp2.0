package com.michalinaef.pharmacyapp.entity;

import jakarta.persistence.*;

@Entity
@Table
public class PharmacyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    private ContactDetailsEntity contactDetails;

    public PharmacyEntity(String name) {
        this.name = name;
//        this.contactDetails = contactDetails;
    }

    public PharmacyEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
