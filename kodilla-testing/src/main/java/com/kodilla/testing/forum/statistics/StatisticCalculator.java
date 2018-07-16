package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    private int usersAmount = 0;
    private int postsAmount = 0;
    private int commentAmount = 0;
    private double avgPostsPerUser = 0.0;
    private double avgCommentsPerUser = 0.0;
    private double avgCommentsPerPost = 0.0;
    private Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
        usersAmount = calculateUsersAmount();
        postsAmount = calculatePostsAmount();
        commentAmount = calculateCommentsAmount();
        avgPostsPerUser = calculateAvgPostsPerUser();
        avgCommentsPerPost = calculateAvgCommentsPerUser();
        avgCommentsPerPost = calculateAvgCommentsPerPost();
    }

    public String showStatistics() {
        StringBuilder result = new StringBuilder();
        result.append("Amount of users: " + usersAmount);
        result.append("\nAmount of posts: " + postsAmount);
        result.append("\nAmount of comments: " + commentAmount);
        result.append("\nAverage of posts per user: " + avgPostsPerUser);
        result.append("\nAverage of comments per user: " + avgCommentsPerUser);
        result.append("\nAverage of comments per post: " + avgCommentsPerUser);
        return result.toString();
    }
    private int calculateUsersAmount() {
        return statistics.userNames().size();
    }

    private int calculatePostsAmount() {
        return statistics.postCount();
    }

    private int calculateCommentsAmount() {
        return statistics.commentsCount();
    }

    private double calculateAvgPostsPerUser() {
        if(usersAmount > 0) {
            return (double)postsAmount / (double)usersAmount;
        }
        return 0.0;
    }

    private double calculateAvgCommentsPerUser() {
        if(usersAmount > 0) {
            return (double)commentAmount / (double)usersAmount;
        }
        return 0.0;
    }

    private double calculateAvgCommentsPerPost() {
        if(postsAmount > 0) {
            return (double)commentAmount / (double)postsAmount;
        }
        return 0.0;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
