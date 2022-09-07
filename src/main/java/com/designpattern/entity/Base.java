package com.designpattern.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Base {
    private Long id;
    private String description;
    private Timestamp createdDate = Timestamp.valueOf(LocalDateTime.now());
    private Timestamp updatedDate = Timestamp.valueOf(LocalDateTime.now());

    public Base(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.updatedDate = Timestamp.valueOf(LocalDateTime.now());
    }

}