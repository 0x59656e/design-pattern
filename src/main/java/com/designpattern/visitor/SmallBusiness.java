package com.designpattern.visitor;

public class SmallBusiness extends Client {

    public SmallBusiness(String description) {
        super(description);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
