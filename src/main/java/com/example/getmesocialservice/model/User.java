package com.example.getmesocialservice.model;

public class User {
    private String name;
    private String address;
    private int age;
    private String profilepicUrl;

    public User(String name, String address, int age, String profilepicUrl) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.profilepicUrl = profilepicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfilepicUrl() {
        return profilepicUrl;
    }

    public void setProfilepicUrl(String profilepicUrl) {
        this.profilepicUrl = profilepicUrl;
    }
}

