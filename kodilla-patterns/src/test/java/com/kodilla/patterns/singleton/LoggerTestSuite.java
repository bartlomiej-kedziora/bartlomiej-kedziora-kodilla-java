package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLogger() {
        Logger.getInstance();
    }

    @Test
    public void testLog() {
        //Given
        //When
        Logger.getInstance().log("testLog");
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("testLog", log);

    }
}