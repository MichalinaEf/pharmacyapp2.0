package com.michalinaef.pharmacyapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateOfOrder;

    public OrderEntity() {
    }

    public OrderEntity(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }
}
