package com.michalinaef.pharmacyapp.entity;

import jakarta.persistence.*;

@Entity
@Table
public class MedicamentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String producer;

    public MedicamentEntity(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    public MedicamentEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
