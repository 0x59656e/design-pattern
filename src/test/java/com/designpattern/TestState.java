package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.state.DoneState;
import com.designpattern.state.InProcessState;
import com.designpattern.state.State;
import com.designpattern.state.Task;

public class TestState {
    final static Logger LOGGER = LoggerFactory.getLogger(TestState.class);

    @Test
    public void testStateChange() {
        Task t = new Task();
        t.action();
        t.switchState(new InProcessState());
        t.action();
        t.switchState(new DoneState());
        t.action();
    }
}
