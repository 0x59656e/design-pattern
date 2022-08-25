package com.designpattern.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Base implements Serializable {
    private Long id;
    private String description;
    private Timestamp createdDate = Timestamp.valueOf(LocalDateTime.now());
    private Timestamp updatedDate = Timestamp.valueOf(LocalDateTime.now());

    public Base(Long id, String description, Timestamp createdDate, Timestamp updatedDate) {
        this.id = id;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Base(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Base() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Base [createdDate=" + createdDate + ", description=" + description + ", id=" + id + ", updatedDate="
                + updatedDate + "]";
    }

}