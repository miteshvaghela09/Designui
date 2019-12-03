package com.example.designui.models;

public class CardClass {
    public String name;
    public String posts;
    public String likes;
    public int image;

    public CardClass(String name, String posts, String likes, int image) {
        this.name = name;
        this.posts = posts;
        this.likes = likes;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
