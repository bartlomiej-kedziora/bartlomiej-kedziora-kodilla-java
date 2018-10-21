package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private Observer observer;
    private final List<String> taskName;
    private final String username;

    public TaskQueue(String username) {
        this.username = username;
        taskName = new ArrayList<>();
    }

    public void addTask(String name) {
        taskName.add(name);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObservers() {
        observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observer = null;
    }

    public List<String> getTaskName() {
        return taskName;
    }

    public String getUsername() {
        return username;
    }
}
