package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uid;
    private final String name;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(final int uid, final String name, final char gender, final LocalDate dateOfBirth, final int postsQuantity) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postsQuantity = postsQuantity;
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
