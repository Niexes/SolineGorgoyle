package com.company;

import java.util.Scanner;

public class Menu {
    public String input;
    Scanner sc = new Scanner(System.in);


    public boolean checkNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public void showMenu(Base base) {
        System.out.println("Введите любое число кроме 0, чтобы запустить меню");
        input = sc.nextLine();
        while (!checkNumber(input)) {
            System.out.println("Попробуйте ещё раз");
            input = sc.nextLine();
        }
        int choice = Integer.parseInt(input);
        while (choice != 0) {
            System.out.println("1 - если хочешь добавить чувака");
            System.out.println("2 - если хочешь изменить данные какого-нибудь чувака");
            System.out.println("3 - показать список чуваков");
            System.out.println("4 - показать список доступных действий для каждого типа чуваков");
            System.out.println("Нажми 0, чтобы выйти из программы");

            String input2 = sc.next();
            sc.nextLine();
            while (!checkNumber(input2)) {
                System.out.println("Попробуйте ещё раз");
                input2 = sc.nextLine();
            }
            int choice2 = Integer.parseInt(input2);

            if (choice2 == 0) {
                break;
            } else if (choice2 > 4 || choice2 < 0) {
                System.out.println("Долбоеб, введи что-нибудь из предложенного");
                System.out.println();
            } else if (choice2 == 1) {
                System.out.println("Кого добавить?");
                System.out.println("1 - студента");
                System.out.println("2 - пиздюка");
                System.out.println("3 - взрослого");
                System.out.println("4 - солевую горгулью");
                System.out.println("5 - выйти в главное меню");
                String s = sc.nextLine();
                while (!checkNumber(s)) {
                    System.out.println("Попробуйте ещё раз");
                    s = sc.nextLine();
                }
                int ch = Integer.parseInt(s);
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
            } else if (choice2 == 2) {
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
            } else if (choice2 == 3) {
                base.showDudesList();
            } else if (choice2 == 4) {
                base.showActionMenu();
                String name2 = sc.next();
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
        String valueWeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueWeight)) {
            System.out.println("Вес не может содержать буквенное значение");
            valueWeight = sc.nextLine();
        }
        int val2 = Integer.parseInt(valueWeight);
        st1.setWeight(val2);
        System.out.println("Введите рост студента " + st1.getName());
        String valueHeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueHeight)) {
            System.out.println("Рост не может содержать буквенное значение");
            valueHeight = sc.nextLine();
        }
        int val3 = Integer.parseInt(valueHeight);
        st1.setHeight(val3);
    }

    public void showMenuForChild(Base base) {
        Child ch2 = new Child();
        base.addChild(ch2);
        System.out.println("Введите имя пиздюка");
        ch2.setName(sc.next());
        System.out.println("Введите вес пиздюка");
        String valueWeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueWeight)) {
            System.out.println("Вес не может содержать буквенное значение");
            valueWeight = sc.nextLine();
        }
        int val2 = Integer.parseInt(valueWeight);
        ch2.setWeight(val2);
        System.out.println("Введите рост пиздюка");
        String valueHeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueHeight)) {
            System.out.println("Рост не может содержать буквенное значение");
            valueHeight = sc.nextLine();
        }
        int val3 = Integer.parseInt(valueHeight);
        ch2.setHeight(val3);
    }

    public void showMenuForGorgoyle(Base base) {
        SolineGorgoyle sg = new SolineGorgoyle();
        base.addSolineGorgoyle(sg);
        System.out.println("Введите имя солевой горгульи");
        sg.setName(sc.next());


        System.out.println("Введите вес солевой горгульи");
        String valueWeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueWeight)) {
            System.out.println("Вес не может содержать буквенное значение");
            valueWeight = sc.nextLine();
        }
        int val2 = Integer.parseInt(valueWeight);
        sg.setWeight(val2);


        System.out.println("Введите рост солевой горгульи");
        String valueHeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueHeight)) {
            System.out.println("Рост не может содержать буквенное значение");
            valueHeight = sc.nextLine();
        }
        int val3 = Integer.parseInt(valueHeight);
        sg.setHeight(val2);
    }

    public void showMenuForAdult(Base base) {
        System.out.println("Введите сначала вес, потом рост для взрослого");
        String valueWeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueWeight)) {
            System.out.println("Вес не может содержать буквенное значение");
            valueWeight = sc.nextLine();
        }
        int val2 = Integer.parseInt(valueWeight);
        String valueHeight = sc.next();
        sc.nextLine();
        while (!checkNumber(valueHeight)) {
            System.out.println("Рост не может содержать буквенное значение");
            valueHeight = sc.nextLine();
        }
        int val3 = Integer.parseInt(valueHeight);
        AdultMan am = new AdultMan(val2, val3);
        base.addAdultMan(am);
        System.out.println("Теперь введите имя");
        am.setName(sc.next());

    }

}

