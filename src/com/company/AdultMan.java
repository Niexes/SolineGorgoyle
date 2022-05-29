package com.company;

public class AdultMan extends Human {
    private int salary;//go fuck yourself

    public AdultMan(int w, int h) {
        setWeight(w);
        setHeight(h);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void walkToJob() {
        System.out.println(this.name + " say: опять на ебанную работу идти");
    }

    @Override
    public String toString() {
        return "Adult man name " + this.name + ", " + " adult man weight " + this.weight + ", " + " adult man height " + this.height;
    }

}
