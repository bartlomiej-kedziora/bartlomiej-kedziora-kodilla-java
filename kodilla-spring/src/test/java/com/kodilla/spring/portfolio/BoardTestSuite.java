package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("getBoard");

        //When
        board.getToDoList().addTask("toDo1");
        board.getDoneList().addTask("done1");
        board.getInProgresList().addTask("inProgress1");

        String resultToDo = board.getToDoList().getTasks().get(0);
        String resultDone = board.getDoneList().getTasks().get(0);
        String resultInProgress = board.getInProgresList().getTasks().get(0);

        //Then
        Assert.assertEquals("toDo1", resultToDo);
        Assert.assertEquals("done1", resultDone);
        Assert.assertEquals("inProgress1", resultInProgress);
    }
}
