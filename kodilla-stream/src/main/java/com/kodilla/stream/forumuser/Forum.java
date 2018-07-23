package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public static List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser(100, "John Smith", 'M', LocalDate.of(1990, 1, 1), 0));
        theList.add(new ForumUser(101, "Dorothy Newman", 'F', LocalDate.of(1995, 2, 1), 10));
        theList.add(new ForumUser(102, "John Wolkowitz", 'M', LocalDate.of(1997, 3, 1), 10));
        theList.add(new ForumUser(103, "Lucy Riley", 'F', LocalDate.of(2001, 4, 1), 10));
        theList.add(new ForumUser(104, "Owen Rogers", 'M', LocalDate.of(2002, 5, 1), 10));
        theList.add(new ForumUser(105, "Matilda Davies", 'F', LocalDate.of(2003, 6, 1), 10));
        theList.add(new ForumUser(106, "Declan Booth", 'M', LocalDate.of(2004, 7, 1), 0));
        theList.add(new ForumUser(107, "Corinne Foster", 'F', LocalDate.of(2005, 8, 1), 10));
        theList.add(new ForumUser(108, "Khloe fry", 'F', LocalDate.of(2006, 9, 1), 10));
        theList.add(new ForumUser(109, "Martin Valenzuela", 'M', LocalDate.of(1988, 10, 1), 10));
        return new ArrayList<ForumUser>(theList);
    }
}
