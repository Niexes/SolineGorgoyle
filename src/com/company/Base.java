package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Base {
    Scanner sc = new Scanner(System.in);
    List<Human> humans = new ArrayList<Human>();

    public void addStudent(Student newStudent) {
        humans.add(0, newStudent);
    }

    public void addChild(Child newChild) {
        humans.add(0, newChild);
    }

    public void addAdultMan(AdultMan newAdult) {
        humans.add(0, newAdult);
    }

    public void addSolineGorgoyle(SolineGorgoyle newSoline) {
        humans.add(0, newSoline);
    }

    public void showDudesList() {
        if (humans.isEmpty()) {
            System.out.println("Вы еще никого не добавили\n");
            return;
        }
        humans.forEach(human -> System.out.println(human.toString()));
    }

    public boolean findDude(String name) {
        for (Human human : humans) {
            if ((human.getName().equals(name))) {
                return true;
            }
        }
        return false;
    }

    public boolean findDudeMap(String name) {
        Map<String, Human> humansMap = humans.stream().collect(Collectors.toMap(human->human.getName(), human -> human));
        return humansMap.containsKey(name);
    }

    public Human findDudeStream(String name) {
        return humans.stream().filter(human -> human.getName().equals(name)).findAny().orElse(null);
    }

    public Human getDude(String name) {
        for (int i = 0; i <= humans.size() - 1; i++) {
            if (((humans.get(i)).getName().equals(name))) {
                return (humans.get(i));
            }
        }
        return null;
    }

    //----------------------КОПИЯ МЕТОДА ИЗ МЕНЮ, НУЖНО ПОЯСНЕНИЕ-----------------------
    public boolean checkNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    //---------------------------------------------------------------------------------------
    public void changeSomeParam(Human human, int pick) {
        switch (pick) {
            case 1:
                System.out.println("Введите новое имя для " + human.getName());
                human.setName(sc.next());
                break;
            case 2:
                System.out.println("Введите новый вес для " + human.getName());
                String value = sc.next();
                sc.nextLine();
                while (!checkNumber(value)) {
                    System.out.println("Вес не может содержать буквенное значение");
                    value = sc.nextLine();
                }
                int val = Integer.parseInt(value);
                human.setWeight(val);
                break;
            case 3:
                System.out.println("Введите новый рост для " + human.getName());
                String value2 = sc.next();
                sc.nextLine();
                while (!checkNumber(value2)) {
                    System.out.println("Рост не может содержать буквенное значение");
                    value2 = sc.nextLine();
                }
                int val2 = Integer.parseInt(value2);
                human.setHeight(val2);
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
                human.dontPass();
                break;
            case 6:
                human.passExam(sc.next());
                break;
            case 7:
                human.walkToJob();
                break;
            case 8:
                human.catchPrihod();
                break;
            case 9:
                break;
            default:
                System.out.println("Введи что-то из предложенного");
        }
    }

}



