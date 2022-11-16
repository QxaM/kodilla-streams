package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main (String[] args){
        System.out.println("Welcome to module 7 - Stream");


        Forum forum = new Forum();
        Map<Integer, ForumUser> theForumUsersResultMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= (LocalDate.now().getYear() - 20))
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# Elements: " + theForumUsersResultMap.size());
        theForumUsersResultMap.entrySet().stream()
                .map(entry->entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
