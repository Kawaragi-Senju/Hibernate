package com.example.hibernate.models;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "credit_history")
public class CreditHistory {

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Integer getOpened() {
        return opened;
    }

    public void setOpened(Integer opened) {
        this.opened = opened;
    }

    public Integer getClosed() {
        return closed;
    }

    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    @OneToOne(mappedBy = "creditHistory")
    private Customer customer;

    @Column(name="start_date")
    private Date start_date;

    @Column(name = "opened")
    private Integer opened;

    @Column(name = "closed")
    private Integer closed;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString(){
        return start_date + " " + opened + " " + closed;
    }
}
