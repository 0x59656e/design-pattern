package com.designpattern.builder;

import com.designpattern.entity.Base;

public class ComponentBuilder extends Base {
    private FooComponent foo;
    private BarComponent bar;
    private BazComponent baz;

    public FooComponent getFoo() {
        return foo;
    }

    public ComponentBuilder setFoo(FooComponent foo) {
        this.foo = foo;
        return this;
    }

    public BarComponent getBar() {
        return bar;
    }

    public ComponentBuilder setBar(BarComponent bar) {
        this.bar = bar;
        return this;
    }

    public BazComponent getBaz() {
        return baz;
    }

    public ComponentBuilder setBaz(BazComponent baz) {
        this.baz = baz;
        return this;
    }

    public SomeContainer build() {
        return new SomeContainer(this);
    }

}
