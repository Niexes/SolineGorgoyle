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
        System.out.println(getName() + " опять пускает слюни");
    }
}