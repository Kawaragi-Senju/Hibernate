package com.example.hibernate.models;

import jakarta.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="content")
    private String content;

    @Column(name="recipientid")
    private Integer recipientId;

    @Column(name="senderid")
    private Integer senderId;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }
}
