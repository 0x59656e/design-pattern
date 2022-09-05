package com.designpattern.memento;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class NotepadBackup {
    private String textString;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    public NotepadBackup(String textString, Timestamp createdDate, Timestamp updatedDate) {
        this.textString = textString;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
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
        return "NotepadBackup [createdDate=" + createdDate + ", textString=" + textString + ", updatedDate="
                + updatedDate + "]";
    }

}
