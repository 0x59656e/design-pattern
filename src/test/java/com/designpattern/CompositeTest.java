package com.designpattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.composite.Accountant;
import com.designpattern.composite.Auditor;
import com.designpattern.composite.Developer;
import com.designpattern.composite.Employee;
import com.designpattern.composite.Manager;
import com.designpattern.composite.Operation;
import com.designpattern.composite.TechLead;

public class CompositeTest {
    static final Logger LOGGER = LoggerFactory.getLogger(CompositeTest.class);
    static final Integer L1_SALARY = 50000;
    static final Integer L2_SALARY = 20000;
    static final Integer L3_SALARY = 10000;
    Random rand = new Random();

    @Test
    public void randLong() {
        Long l = rand.nextLong();
        assertNotNull(l);
    }

    @Test
    public void compositeDump() {
        Employee techLeadFoo = new TechLead(rand.nextLong(), "Teddy Louis", "Tech", L1_SALARY);
        Employee techLeadBar = new TechLead(rand.nextLong(), "Bear Bar", "Tech", L1_SALARY);
        Employee manager = new Manager(rand.nextLong(), "Bear Bar", "Tech", L1_SALARY);

        Employee devFoo = new Developer(rand.nextLong(), "Duke Dev", "Tech", L2_SALARY);
        Employee devBoo = new Developer(rand.nextLong(), "Darius Dev", "Tech", L3_SALARY);
        Employee devBao = new Developer(rand.nextLong(), "Dick Dev", "Tech", L3_SALARY);
        Employee devBai = new Developer(rand.nextLong(), "Dennis Dev", "Tech", L2_SALARY);

        Employee opsFoo = new Operation(rand.nextLong(), "Oak Ops", "Tech", L3_SALARY);
        Employee opsOoo = new Operation(rand.nextLong(), "Oreilly Ops", "Tech", L3_SALARY);
        Employee opsOao = new Operation(rand.nextLong(), "Oreo Ops", "Tech", L3_SALARY);
        Employee opsOai = new Operation(rand.nextLong(), "Obama Ops", "Tech", L3_SALARY);

        Employee accFoo = new Accountant(rand.nextLong(), "Duke Dev", "Tech", L2_SALARY);
        Employee accBoo = new Accountant(rand.nextLong(), "Darius Dev", "Tech", L3_SALARY);
        Employee auBao = new Auditor(rand.nextLong(), "Dick Dev", "Tech", L3_SALARY);
        Employee auBai = new Auditor(rand.nextLong(), "Dennis Dev", "Tech", L2_SALARY);

        techLeadFoo.add(devFoo);
        techLeadFoo.add(devBoo);
        techLeadFoo.add(devBao);
        techLeadFoo.add(devBai);
        techLeadBar.add(opsFoo);
        techLeadBar.add(opsOoo);
        techLeadBar.add(opsOao);
        techLeadBar.add(opsOai);
        manager.add(accFoo);
        manager.add(accBoo);
        manager.add(auBao);
        manager.add(auBai);

        assertNotNull(techLeadBar.getSubordinate());
        assertNotNull(techLeadFoo.getSubordinate());
        assertNotNull(manager.getSubordinate());

        for (Employee employee : techLeadBar.getSubordinate()) {
            LOGGER.info(employee.toString());
        }

        LOGGER.info("===========================================");
        for (Employee employee : techLeadFoo.getSubordinate()) {
            LOGGER.info(employee.toString());
        }

        LOGGER.info("===========================================");
        for (Employee employee : manager.getSubordinate()) {
            LOGGER.info(employee.toString());
        }

    }
}
