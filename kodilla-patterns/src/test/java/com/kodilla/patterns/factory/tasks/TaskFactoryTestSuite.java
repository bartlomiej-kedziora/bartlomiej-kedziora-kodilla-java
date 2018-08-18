package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTaskStateNotCompleted() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        ShoppingTask shopping = (ShoppingTask)factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        boolean state = shopping.isTaskExecuted();
        //shopping.getTaskState().setState(TaskState.State.COMPLETED);

        //Then
        System.out.println(shopping.getTaskName() + " is executed: " + state);
        Assert.assertFalse(state);
    }

    @Test
    public void testFactoryPaintingTaskStateCompleted() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        PaintingTask painting = (PaintingTask)factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        painting.getTaskState().setState(TaskState.State.COMPLETED);
        boolean state = painting.isTaskExecuted();

        //Then
        System.out.println(painting.getTaskName() + " is executed: " + state);
        Assert.assertTrue(state);
    }

    @Test
    public void testFactoryDrivingTaskFields() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        DrivingTask driving = (DrivingTask)factory.makeTask(TaskFactory.DRIVING);
        TaskState.State stateType = driving.getTaskState().getState();
        boolean state = driving.isTaskExecuted();
        String expected = "DrivingTask{taskName='driving', where='work', using='car'}";

        //Then
        System.out.println(driving.getTaskName() + " is executed: " + state);
        Assert.assertEquals(TaskState.State.DISABLED, stateType);
        Assert.assertEquals(expected, driving.toString());
    }
}
