package com.designpattern.prototype;

import java.sql.Timestamp;
import java.time.Duration;

import com.designpattern.entity.Base;

public abstract class Cell extends Base implements Cloneable {
    Duration lifespan;

    Cell(Long id, String description, Timestamp createdDate, Timestamp updatedDate, Duration lifespan) {
        super(id, description, createdDate, updatedDate);
        this.lifespan = lifespan;
    }

    Cell(Long id, String description, Timestamp createdDate, Timestamp updatedDate) {
        super(id, description, createdDate, updatedDate);
    }
    Cell(Long id, String description) {
        super(id, description);
    }

    Cell(Duration lifespan) {
        this.lifespan = lifespan;
    }
    public abstract Cell copy();
    @Override
    public String toString() {
        return "Cell [lifespan=" + lifespan + "] + " + super.toString();
    }
    
}
