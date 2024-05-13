package com.example.hibernate.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
