package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String username;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(username + ": New task " +
                taskQueue.getTaskName().get(taskQueue.getTaskName().size() - 1) +
        "\n\tfrom " + taskQueue.getUsername());
    }
}
