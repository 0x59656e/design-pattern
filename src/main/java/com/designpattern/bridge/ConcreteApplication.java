package com.designpattern.bridge;

public class ConcreteApplication implements Application{
    Plugin plugin;

    @Override
    public Plugin loadPlugin() {
        return plugin;
    }
    
}
