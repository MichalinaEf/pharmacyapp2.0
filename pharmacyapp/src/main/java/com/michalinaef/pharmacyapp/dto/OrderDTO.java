package com.michalinaef.pharmacyapp.dto;

import java.time.LocalDate;

public class OrderDTO {

    private LocalDate dateOfOrder;

    public OrderDTO(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "dateOfOrder=" + dateOfOrder +
                '}';
    }
}
