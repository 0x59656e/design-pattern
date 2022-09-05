package com.designpattern.mediator;

public interface Mediator<T, G> {
    void communicate(T t, G g);
}
