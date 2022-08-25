package com.designpattern.builder;

public class SomeContainer {
    private FooComponent foo;
    private BarComponent bar;
    private BazComponent baz;

    public SomeContainer(ComponentBuilder componentBuilder) {
        this.foo = componentBuilder.getFoo();
        this.bar = componentBuilder.getBar();
        this.baz = componentBuilder.getBaz();
    }

    @Override
    public String toString() {
        return "SomeContainer [bar=" + bar + ", baz=" + baz + ", foo=" + foo + "]";
    }

}
