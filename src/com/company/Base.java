package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base {
    Scanner sc = new Scanner(System.in);
    List<Human> newObj = new ArrayList<Human>();

    public void addStudent(Student newStudent) {
        newObj.add(0, newStudent);
    }

    public void addChild(Child newChild) {
        newObj.add(0, newChild);
    }

    public void addAdultMan(AdultMan newAdult) {
        newObj.add(0, newAdult);
    }

    public void addSolineGorgoyle(SolineGorgoyle newSoline) {
        newObj.add(0, newSoline);
    }

    public void showDudesList() {
        for (int i = 0; i <= newObj.size() - 1; i++) {
            System.out.println(newObj.get(i));
        }
        if (newObj.size() == 0) {
            System.out.println("Вы еще никого не добавили\n");
        }
    }

    public boolean findDude(String s) {
        for (int i = 0; i <= newObj.size() - 1; i++) {
            if (((newObj.get(i)).getName().equals(s))) {
                return true;
            }
        }
        return false;
    }

    public Human getDude(String s) {
        for (int i = 0; i <= newObj.size() - 1; i++) {
            if (((newObj.get(i)).getName().equals(s))) {
                return (newObj.get(i));
            }
        }
        return null;
    }

    public void changeSomeParam(Human human, int pick) {
        switch (pick) {
            case 1:
                System.out.println("Введите новое имя для " + human.getName());
                human.setName(sc.next());
                break;
            case 2:
                System.out.println("Введите новый вес для " + human.getName());
                human.setWeight(sc.nextInt());
                break;
            case 3:
                System.out.println("Введите новый рост для " + human.getName());
                human.setHeight(sc.nextInt());
                break;
            case 4:
                break;
            default:
                System.out.println("Для выхода в главное меню нажми 4 либо что-то из предложенного, дебил");
        }
    }

    public void showActionMenu() {
        System.out.println("Все представленные персонажи могут просто ходить и просто говорить\nВведите сначада имя персонажа, а потом что ему делать\n" +
                "1 - ходить\n2 - говорить\n3 - ребенок умеет пускать слюни\n4 - студент пьет пиво\n" +
                "5 - студент не сдает экзамен\n6 - студент сдает экзамен\n7 - взрослый идет на работу\n8 - солевая горгулья ловит приход\n9 - назад\n");
    }

    public void doSomeAction(Human human, int pick) {
        switch (pick) {
            case 1:
                human.walk();
                break;
            case 2:
                human.talk();
                break;
            case 3:
                human.drooling();
                break;
            case 4:
                human.drink();
                break;
            case 5:
                human.dontPass(sc.next());
                break;
            case 6:
                human.passExam(sc.next());
                break;
            case 7:
                human.walkToJob();
                break;
            case 8: human.catchPrihod();
            break;
            case 9: break;
            default:
                System.out.println("Введи что-то из предложенного");
        }
    }

}



