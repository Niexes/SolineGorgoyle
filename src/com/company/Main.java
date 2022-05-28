package com.company;

import java.io.IOException;
import java.util.ArrayList;

/*TODO  Задание 2
поправить правки, и не выебывайся что это не важно
это блять важно

для всех добавить поле имя
выводы действий на экран делаются Имя + фраза
*/
public class Main {

    public static void main(String[] args) throws IOException {
        Child child1 = new Child();
        child1.setName("Саша");
        child1.talk();
        child1.drooling();
        AdultMan man1 = new AdultMan(55, 185);
        man1.setName("Vitya");
        man1.walk();
        man1.walkToJob();
        AdultMan man2 = new AdultMan(76, 173);

        System.out.println(man2.height);
        System.out.println(man2.weight);

        SolineGorgoyle haaaaaaa = new SolineGorgoyle();
        haaaaaaa.setHeight(176);
        haaaaaaa.setWeight(45);
        haaaaaaa.catchPrihod(0.85);
        haaaaaaa.setSolenost(0.2);
        System.out.println(haaaaaaa.getSolenost());
        System.out.println(haaaaaaa.getWeight());
        Student student1 = new Student();
        student1.setName("Grisha");
        student1.setWeight(98);
        student1.dontPass("Физра");
        student1.dontPass("Матан");
        student1.dontPass("Матстат");
        student1.passExam("Линал");
        student1.passExam("Физра");
        System.out.println(student1.getWeight());
        student1.dontPass("Физра2");
        student1.dontPass("Матан2");
        student1.dontPass("Матстат2");
        student1.getDebtList();
        System.out.println(student1.getWeight());
    }
}
