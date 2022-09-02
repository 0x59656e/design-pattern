package com.designpattern.state;

public class Task {
    private State currentState = new DraftState();

    public void switchState(State newState) {
        this.currentState = newState;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void action() {
        this.currentState.action();
    }

}
