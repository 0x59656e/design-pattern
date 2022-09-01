package com.designpattern.chain;

public abstract class Handler {
    private Handler nextHandler;

    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Boolean handle(String password) throws Exception {
        if (nextHandler != null) {
            nextHandler.handle(password);
        }
        var rs = check(password);
        if (!rs) {
           throw new Exception("Uncompliant Password!") ;
        }
        return check(password);
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    abstract Boolean check(String password);
}
