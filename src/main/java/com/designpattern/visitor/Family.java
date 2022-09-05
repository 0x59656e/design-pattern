package com.designpattern.visitor;

public class Family extends Client {

    public Family(String description) {
        super(description);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
