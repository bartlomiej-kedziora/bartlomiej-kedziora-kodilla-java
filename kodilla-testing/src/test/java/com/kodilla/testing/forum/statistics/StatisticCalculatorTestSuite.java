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
    public void testCalculateAdvStatisticWithPostCountEqual0() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postCount()).thenReturn(0);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(0, amountOfComments);
        Assert.assertEquals(0, amountOfPosts);
        Assert.assertEquals(0, amountsOfUser);
    }

    @Test
    public void testCalculateAdvStatisticWithPostCountEqual1000() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postCount()).thenReturn(1000);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(0, amountOfComments);
        Assert.assertEquals(1000, amountOfPosts);
        Assert.assertEquals(0, amountsOfUser);

    }

    @Test
    public void testCalculateAdvStatisticWithCommentsCountEqual0() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(0, amountOfComments);
        Assert.assertEquals(0, amountOfPosts);
        Assert.assertEquals(0, amountsOfUser);

    }

    @Test
    public void testCalculateAdvStatisticWithCommentsCountLowerThanPostCount() {
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
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(0.5, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(500, amountOfComments);
        Assert.assertEquals(1000, amountOfPosts);
        Assert.assertEquals(0, amountsOfUser);

    }

    @Test
    public void testCalculateAdvStatisticWithCommentsCountGreaterThanPostCount() {
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
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(2.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(1000, amountOfComments);
        Assert.assertEquals(500, amountOfPosts);
        Assert.assertEquals(0, amountsOfUser);

    }

    @Test
    public void testCalculateAdvStatisticWithUserNamesEqual0() {
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
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(0, amountOfComments);
        Assert.assertEquals(0, amountOfPosts);
        Assert.assertEquals(0, amountsOfUser);

    }

    @Test
    public void testCalculateAdvStatisticWithUserNamesEqual100() {
        //Given
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Statistics statistics = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int i=0; i<100; i++) {
            users.add("test#" + i);
        }
        when(statistics.userNames()).thenReturn(users);

        //When
        statisticCalculator.calculateAdvStatistics(statistics);
        double amountOfAvgCommentsPerPost = statisticCalculator.getAvgCommentsPerPost();
        double amountOfAvgCommentsPerUser = statisticCalculator.getAvgCommentsPerUser();
        double amountOfAvgPostsPerUser = statisticCalculator.getAvgPostsPerUser();
        int amountOfComments = statisticCalculator.getCommentAmount();
        int amountOfPosts = statisticCalculator.getPostsAmount();
        int amountsOfUser = statisticCalculator.getUsersAmount();

        //Then
        Assert.assertEquals(0.0, amountOfAvgCommentsPerPost, 0);
        Assert.assertEquals(0.0, amountOfAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, amountOfAvgPostsPerUser, 0);
        Assert.assertEquals(0, amountOfComments);
        Assert.assertEquals(0, amountOfPosts);
        Assert.assertEquals(100, amountsOfUser);

    }
}