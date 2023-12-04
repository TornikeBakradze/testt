package com.example.learndoe.Entity;


public class TESTDBModel {

    private String name;

    private String lastname;

    public TESTDBModel(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public TESTDBModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
