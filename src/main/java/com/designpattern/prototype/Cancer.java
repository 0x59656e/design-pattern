package com.designpattern.prototype;

import java.sql.Timestamp;

public class Cancer extends Cell {

    public Cancer(Long id, String description) {
        super(id, description);
    }

    public Cancer(Long id, String description, Timestamp createdDate, Timestamp updatedDate) {
        super(id, description, createdDate, updatedDate);
    }

    @Override
    public Cell copy() {
        Cancer cancer = new Cancer(this.getId(), this.getDescription(), this.getCreatedDate(), this.getUpdatedDate());
        cancer.lifespan = this.lifespan;
        return cancer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Cancer))
            return false;
        Cancer cancer = (Cancer) obj;
        return this.getId() == cancer.getId() &&
                this.getDescription() == cancer.getDescription() &&
                this.getUpdatedDate() == cancer.getUpdatedDate() &&
                this.getCreatedDate() == cancer.getCreatedDate() &&
                this.lifespan == cancer.lifespan;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}