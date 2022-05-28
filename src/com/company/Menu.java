package com.company;

import java.util.Scanner;

public class Menu {
   public int choice = 1;
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Введите любое число кроме 0, чтобы запустить меню");
        choice = sc.nextInt();
        while (choice != 0) {
            System.out.println("Если хочешь добавить чувака, нажми 1");
            System.out.println("Если хочешь изменить данные какого-нибудь чувака, нажми 2");
            System.out.println("Показать список чуваков - 3");
            System.out.println("Нажми 0, чтобы выйти из программы");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice >3 || choice <0 ) {
                System.out.println("Долбоеб, введи что-нибудь из предложенного");
                System.out.println();
            } else if (choice == 1) {
                System.out.println("Кого добавить?");
                System.out.println("Студента - 1");
                System.out.println("Пиздюка - 2");
                System.out.println("Взрослого - 3");
                System.out.println("Солевую горгулью - 4");
                System.out.println("Выйти в главное меню - 5");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        showMenuForStudent();
                        break;
                    case 2:
                        showMenuForChild();
                        break;
                    case 3:
                        showMenuForAdult();
                        break;
                    case 4:
                        showMenuForGorgoyle();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Дебил, введи что-то из предложенного\nОпять все заново\n");
                        break;
                }
            } else if (choice ==2) {
                System.out.println("Sorry, the section is not available now");
            }

        }
    }

   public void showMenuForStudent() {
       Student st1 = new Student();

       System.out.println("Введите имя студента");
       st1.setName(sc.next());
       System.out.println("Введите вес студента " + st1.getName());
       st1.setWeight(sc.nextInt());
       System.out.println("Введите рост студента " + st1.getName());
       st1.setHeight(sc.nextInt());
   }
   public void showMenuForChild() {
       Child ch2 = new Child();
       System.out.println("Введите имя пиздюка");
       ch2.setName(sc.next());
       System.out.println("Введите вес пиздюка");
       ch2.setWeight(sc.nextInt());
       System.out.println("Введите рост пиздюка");
       ch2.setHeight(sc.nextInt());
   }

   public void showMenuForGorgoyle() {
        SolineGorgoyle sg = new SolineGorgoyle();
       System.out.println("Введите имя солевой горгульи");
       sg.setName(sc.next());
       System.out.println("Введите вес солевой горгульи");
       sg.setWeight(sc.nextInt());
       System.out.println("Введите рост солевой горгульи");
       sg.setHeight(sc.nextInt());
   }
   public void showMenuForAdult() {
       System.out.println("Введите сначала вес, потом рост для взрослого");
        AdultMan am = new AdultMan(sc.nextInt(), sc.nextInt());
       System.out.println("Теперь введите имя");
       am.setName(sc.next());

   }




}

