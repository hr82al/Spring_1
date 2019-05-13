package ru.geekbrains.java.Spring_1.entities;

public class Human {
    private int id;
    private int parentId;

    public Human() {
    }

    public Human(int id, int parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
