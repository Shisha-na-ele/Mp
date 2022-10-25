package com.mp.model;




public class Manager {

    private int id;


    private String name;


    public Manager() {
    }

    public Manager(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}
