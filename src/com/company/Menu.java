package com.company;

import java.util.Scanner;

public class Menu {
    public int choice;
    Scanner sc = new Scanner(System.in);

    public void showMenu(Base base) {
        System.out.println("Введите любое число кроме 0, чтобы запустить меню");
        choice = sc.nextInt();
        while (choice != 0) {
            System.out.println("1 - если хочешь добавить чувака");
            System.out.println("2 - если хочешь изменить данные какого-нибудь чувака");
            System.out.println("3 - показать список чуваков");
            System.out.println("4 - показать список доступных действий для каждого типа чуваков");
            System.out.println("Нажми 0, чтобы выйти из программы");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice > 4 || choice < 0) {
                System.out.println("Долбоеб, введи что-нибудь из предложенного");
                System.out.println();
            } else if (choice == 1) {
                System.out.println("Кого добавить?");
                System.out.println("1 - студента");
                System.out.println("2 - пиздюка");
                System.out.println("3 - взрослого");
                System.out.println("4 - солевую горгулью");
                System.out.println("5 - выйти в главное меню");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        showMenuForStudent(base);
                        break;
                    case 2:
                        showMenuForChild(base);
                        break;
                    case 3:
                        showMenuForAdult(base);
                        break;
                    case 4:
                        showMenuForGorgoyle(base);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Дебил, введи что-то из предложенного\nОпять все заново\n");
                        break;
                }
            } else if (choice == 2) {
                System.out.println("Введите точное имя чувака, которого хотите изменить");
                String name = sc.next();
                if (base.findDude(name)) {
                    System.out.println("Что изменить?");
                    System.out.println("1 - имя");
                    System.out.println("2 - вес");
                    System.out.println("3 - рост");
                    System.out.println("4 - назад");
                    int pick = sc.nextInt();
                    base.changeSomeParam(base.getDude(name), pick);
                } else {
                    System.out.println("Извините, такого чувака нет\n");
                }
            } else if (choice == 3) {
                base.showDudesList();
            } else if (choice == 4) {
                base.showActionMenu();
                String name2 = sc.next();
                //int pick2 = sc.nextInt();
                if (base.findDude(name2)) {
                    base.doSomeAction(base.getDude(name2), sc.nextInt());
                } else {
                    System.out.println("Извините, такого чувака нет\n");
                }
            }

        }
    }

    public void showMenuForStudent(Base base) {
        Student st1 = new Student();
        base.addStudent(st1);
        System.out.println("Введите имя студента");
        st1.setName(sc.next());
        System.out.println("Введите вес студента " + st1.getName());
        st1.setWeight(sc.nextInt());
        System.out.println("Введите рост студента " + st1.getName());
        st1.setHeight(sc.nextInt());
    }

    public void showMenuForChild(Base base) {
        Child ch2 = new Child();
        base.addChild(ch2);
        System.out.println("Введите имя пиздюка");
        ch2.setName(sc.next());
        System.out.println("Введите вес пиздюка");
        ch2.setWeight(sc.nextInt());
        System.out.println("Введите рост пиздюка");
        ch2.setHeight(sc.nextInt());
    }

    public void showMenuForGorgoyle(Base base) {
        SolineGorgoyle sg = new SolineGorgoyle();
        base.addSolineGorgoyle(sg);
        System.out.println("Введите имя солевой горгульи");
        sg.setName(sc.next());
        System.out.println("Введите вес солевой горгульи");
        sg.setWeight(sc.nextInt());
        System.out.println("Введите рост солевой горгульи");
        sg.setHeight(sc.nextInt());
    }

    public void showMenuForAdult(Base base) {
        System.out.println("Введите сначала вес, потом рост для взрослого");
        AdultMan am = new AdultMan(sc.nextInt(), sc.nextInt());
        base.addAdultMan(am);
        System.out.println("Теперь введите имя");
        am.setName(sc.next());

    }

}

