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
        return new StringBuilder()
        .append("Amount of users: " + usersAmount)
        .append("\nAmount of posts: " + postsAmount)
        .append("\nAmount of comments: " + commentAmount)
        .append("\nAverage of posts per user: " + avgPostsPerUser)
        .append("\nAverage of comments per user: " + avgCommentsPerUser)
        .append("\nAverage of comments per post: " + avgCommentsPerUser)
        .toString();
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
            return (double)postsAmount / usersAmount;
        }
        return 0.0;
    }

    private double calculateAvgCommentsPerUser() {
        if(usersAmount > 0) {
            return (double)commentAmount / usersAmount;
        }
        return 0.0;
    }

    private double calculateAvgCommentsPerPost() {
        if(postsAmount > 0) {
            return (double)commentAmount / postsAmount;
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

    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentAmount() {
        return commentAmount;
    }
}
