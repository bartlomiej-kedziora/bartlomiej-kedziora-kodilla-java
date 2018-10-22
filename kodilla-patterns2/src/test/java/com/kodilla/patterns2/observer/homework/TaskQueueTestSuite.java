package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("Jan");
        TaskQueue taskQueue2 = new TaskQueue("Anna");
        TaskQueue taskQueue3 = new TaskQueue("Tom");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneBlue = new Mentor("Ivone Blue");
        taskQueue1.registerObserver(johnSmith);
        taskQueue2.registerObserver(johnSmith);
        taskQueue3.registerObserver(ivoneBlue);

        //When
        taskQueue1.addTask("JanTask1");
        taskQueue1.addTask("JanTask2");
        taskQueue2.addTask("AnnaTask1");
        taskQueue3.addTask("TomTask1");

        //Then
        assertEquals(2, taskQueue1.getTaskName().size());
        assertEquals(1, taskQueue2.getTaskName().size());
        assertEquals(1, taskQueue3.getTaskName().size());
    }

    @Test
    public void testOneUserWithTwoMentors() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("Jan");
        TaskQueue taskQueue2 = new TaskQueue("Anna");
        TaskQueue taskQueue3 = new TaskQueue("Tom");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneBlue = new Mentor("Ivone Blue");

        //When
        taskQueue1.registerObserver(johnSmith);
        taskQueue1.registerObserver(ivoneBlue);
        taskQueue2.registerObserver(johnSmith);
        taskQueue3.registerObserver(ivoneBlue);
        taskQueue1.addTask("JanTask1");
        taskQueue1.addTask("JanTask2");
        taskQueue2.addTask("AnnaTask1");
        taskQueue3.addTask("TomTask1");


        //Then
        assertEquals(2, taskQueue1.getObservers().size());
        assertEquals(1, taskQueue2.getObservers().size());
        assertEquals(1, taskQueue3.getObservers().size());
    }

    @Test
    public void testRemoveObserver() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("Jan");
        TaskQueue taskQueue2 = new TaskQueue("Anna");
        TaskQueue taskQueue3 = new TaskQueue("Tom");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneBlue = new Mentor("Ivone Blue");
        taskQueue1.registerObserver(johnSmith);
        taskQueue1.registerObserver(ivoneBlue);
        taskQueue2.registerObserver(johnSmith);
        taskQueue3.registerObserver(ivoneBlue);

        //When
        taskQueue1.removeObserver(johnSmith);
        taskQueue1.addTask("JanTask1");
        taskQueue1.addTask("JanTask2");
        taskQueue2.addTask("AnnaTask1");
        taskQueue3.addTask("TomTask1");

        //Then
        assertEquals(1, taskQueue1.getObservers().size());
        assertEquals(1, taskQueue2.getObservers().size());
        assertEquals(1, taskQueue3.getObservers().size());
    }
}
