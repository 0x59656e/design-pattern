package com.designpattern.memento;

import java.sql.Timestamp;

import java.time.LocalDateTime;

public class Notepad {
    private String textString;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    public Notepad(String textString) {
        this.textString = textString;
        this.createdDate = Timestamp.valueOf(LocalDateTime.now());
        this.updatedDate = Timestamp.valueOf(LocalDateTime.now());
    }

    public String getTextString() {
        return textString;
    }

    public void setTextString(String textString) {
        this.textString = textString;
        this.updatedDate = Timestamp.valueOf(LocalDateTime.now());
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
        return "Notepad [createdDate=" + createdDate + ", textString=" + textString + ", updatedDate=" + updatedDate
                + "]";
    }

}
