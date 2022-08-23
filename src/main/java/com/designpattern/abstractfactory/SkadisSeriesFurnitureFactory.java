package com.designpattern.abstractfactory;

public class SkadisSeriesFurnitureFactory implements OlrsFurnitureFactory {

    public Desk getDesk() {
        return new SkadisDesk();
    }

    public Drawer getDrawer() {
        return new SkadisDrawer();
    }

}
