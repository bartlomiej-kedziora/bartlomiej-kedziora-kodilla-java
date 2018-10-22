package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private List<Observer> observers;
    private final List<String> taskName;
    private final String username;

    public TaskQueue(String username) {
        this.username = username;
        taskName = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addTask(String name) {
        taskName.add(name);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTaskName() {
        return taskName;
    }

    public String getUsername() {
        return username;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
