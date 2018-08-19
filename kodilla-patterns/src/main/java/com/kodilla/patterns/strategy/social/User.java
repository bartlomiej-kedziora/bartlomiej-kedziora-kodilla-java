package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    SocialPublisher socialPublisher;

    public User(final String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
