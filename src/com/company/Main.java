package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Child Sasha = new Child();
        Sasha.Talk();
        AdultMan Vitya = new AdultMan(55, 185);
        Vitya.Walk();
        Vitya.WalkToJob();
        AdultMan Igor = new AdultMan(76, 173);

        System.out.println(Igor.getHeight());
        System.out.println(Igor.getWeight());
    }









}
