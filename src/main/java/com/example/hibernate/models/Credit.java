package com.example.hibernate.models;

import jakarta.persistence.*;

@Entity
@Table(name = "credits")
public class Credit {

    @ManyToOne()
    @JoinColumn(name = "customers_id")
    private Customer customer;

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
