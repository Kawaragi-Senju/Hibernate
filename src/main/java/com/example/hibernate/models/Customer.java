package com.example.hibernate.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "credit_history_id", referencedColumnName = "id")
    private CreditHistory creditHistory;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customers_projects",
            joinColumns = {@JoinColumn(name="custromers_id",referencedColumnName="id")},
            inverseJoinColumns = {@JoinColumn( name = "projects_id", referencedColumnName = "id")}
    )
    List<Project> projectList;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Credit> creditList;

    public Customer() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditHistory getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(CreditHistory creditHistory) {
        this.creditHistory = creditHistory;
    }

    public List<Credit> getCreditList() {
        return creditList;
    }

    public void setCreditList(List<Credit> creditList) {
        this.creditList = creditList;
    }
}
