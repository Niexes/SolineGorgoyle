package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
        Child Sasha = new Child();
        Sasha.talk();
        AdultMan Vitya = new AdultMan(55, 185);
        Vitya.walk();
        Vitya.walkToJob();
        AdultMan Igor = new AdultMan(76, 173);

        System.out.println(Igor.getHeight());
        System.out.println(Igor.getWeight());

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
