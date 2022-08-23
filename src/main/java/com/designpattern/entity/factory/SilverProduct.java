package com.designpattern.entity.factory;

import java.sql.Timestamp;

import com.designpattern.entity.Base;

public class SilverProduct extends Base implements ProductTexture {
    private String texture;

    public SilverProduct(Long id, String description, Timestamp createdDate, Timestamp updatedDate, String texture) {
        super(id, description, createdDate, updatedDate);
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public String getProductInfo() {
        return this.texture + '\n' + this.getDescription();
    }

    @Override
    public String toString() {
        return "SilverProduct [texture=" + texture + "]" + " + " + super.toString();
    }

}
