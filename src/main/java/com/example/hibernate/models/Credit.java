package com.example.hibernate.models;

import jakarta.persistence.*;

@Entity
@Table(name = "credits")
public class Credit {

    private Boolean closed;

    @ManyToOne()
    @JoinColumn(name = "customers_id")
    private Customer customer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
