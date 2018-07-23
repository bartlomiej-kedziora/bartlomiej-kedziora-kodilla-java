package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Map<Integer, ForumUser> theResultMapOfForumUsers = Forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1999)
                .filter(forumUser -> forumUser.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUid, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
