package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.visitor.Family;
import com.designpattern.visitor.FamilyVisitor;
import com.designpattern.visitor.SmallBusiness;
import com.designpattern.visitor.SmallBusinessVisitor;
import com.designpattern.visitor.Visitor;

public class TestVisitor {
    final static Logger LOGGER = LoggerFactory.getLogger(Visitor.class);

    @Test
    public void name() {
        Family family = new Family("Foo");
        SmallBusiness smallBusiness = new SmallBusiness("bar");
        family.accept(new FamilyVisitor());
        smallBusiness.accept(new SmallBusinessVisitor());
    }
}
