package com.designpattern.abstractfactory;

public class AlexSeriesFurnitureFactory implements OlrsFurnitureFactory{

    public Desk getDesk() {
        return new AlexDesk();
    }

    public Drawer getDrawer() {
        return new AlexDrawer();
    }
    
}
