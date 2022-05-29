package com.company;

public class Child extends Human {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void drooling() {
        System.out.println(this.name + " опять пускает слюни");
    }

    @Override
    public String toString() {
        return "Child name " + this.name + ", " + " child weight " + this.weight + ", " + " child height " + this.height;
    }
}