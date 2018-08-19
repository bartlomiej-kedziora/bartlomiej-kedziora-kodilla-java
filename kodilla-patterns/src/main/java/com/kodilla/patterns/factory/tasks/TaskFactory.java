package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(String task) {
        switch(task) {
            case SHOPPING :
                return new ShoppingTask("shopping", "wheels", 4);
            case PAINTING :
               return new PaintingTask("painting", "black", "car");
            case DRIVING :
                return new DrivingTask("driving", "work", "car");
            default:
                return null;
        }
    }
}
