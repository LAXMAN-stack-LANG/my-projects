package com.example;

import javax.persistence.*;

@Entity
@Table(name="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Blog blog;

    private String text;

    public Comment() {
    }


    public Comment(int id, User user, Blog blog, String text) {
        this.id = id;
        this.user = user;
        this.blog = blog;
        this.text = text;
    }

   
    public Comment(User user, Blog blog, String text) {
        this.user = user;
        this.blog = blog;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Blog getBlog() {
        return blog;
    }

    public String getText() {
        return text;
    }

}