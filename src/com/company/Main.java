package com.company;

import java.util.ArrayDeque;
//TODO ненужный импорт

/*TODO  Задание 2
поправить правки, и не выебывайся что это не важно
это блять важно

для всех добавить поле имя
выводы действий на экран делаются Имя + фраза
*/
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




//TODO охуеть а эти пустые строки кому?




}
