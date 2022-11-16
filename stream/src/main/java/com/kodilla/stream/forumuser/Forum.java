package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "user1", 'M', LocalDate.of(2012, 2, 12), 200));
        userList.add(new ForumUser(2, "user2", 'M', LocalDate.of(2000, 5, 1), 125));
        userList.add(new ForumUser(3, "user3", 'F', LocalDate.of(1992, 3, 9), 200));
        userList.add(new ForumUser(4, "user4", 'M', LocalDate.of(1992, 6, 11), 0));
        userList.add(new ForumUser(5, "user5", 'M', LocalDate.of(1992, 7, 28), 200));
        userList.add(new ForumUser(6, "user6", 'F', LocalDate.of(1990, 10, 24), 5));
        userList.add(new ForumUser(7, "user7", 'M', LocalDate.of(1992, 4, 23), 1));
        userList.add(new ForumUser(8, "user8", 'M', LocalDate.of(1997, 2, 5), 0));
        userList.add(new ForumUser(9, "user9", 'F', LocalDate.of(2003, 1, 4), 12));
        userList.add(new ForumUser(10, "user10", 'F', LocalDate.of(1994, 12, 31), 25));
        userList.add(new ForumUser(11, "user11", 'M', LocalDate.of(2002, 11, 25), 1));
        userList.add(new ForumUser(12, "user12", 'M', LocalDate.of(2002, 11, 10), 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
