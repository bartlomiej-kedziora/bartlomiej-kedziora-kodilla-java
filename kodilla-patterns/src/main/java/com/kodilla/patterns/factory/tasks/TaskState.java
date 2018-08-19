package com.kodilla.patterns.factory.tasks;

public class TaskState {
    //public static final String DISABLED = "DISABLED";
    //public static final String ENABLED = "ENABLED";
    //public static final String COMPLETED = "COMPLETED";

    public static enum State {
        DISABLED,
        ENABLED,
        COMPLETED
    }

    private State state;

    public TaskState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
