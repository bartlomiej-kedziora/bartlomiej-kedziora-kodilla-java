package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCalculatorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatistic1() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postCount()).thenReturn(0);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatistic2() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postCount()).thenReturn(1000);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatistic3() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatistic4() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(500);
        when(statistics.postCount()).thenReturn(1000);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0.5, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatistic5() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(1000);
        when(statistics.postCount()).thenReturn(500);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(2.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatistic6() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statistics.userNames()).thenReturn(users);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }

    @Test
    public void testCalculateAdvStatistic7() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int i=0; i<100; i++) {
            users.add("test");
        }
        when(statistics.userNames()).thenReturn(users);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);

    }
}