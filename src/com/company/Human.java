package com.company;
import java.util.Scanner;

class Human implements Skillable {
    Scanner sc = new Scanner(System.in);

    /*сделать считывание имен и других данных через консоль
    в консоли будет приложение с менюшкой
-добавить чувака (открывается выбор какого чувака добавить)
-список чуваков
-изменить данные чувака

    пользователю на консоль выводится меню с цифрами, он вводит цифру, отсюда пляшем

    должен быть класс обработчик (сервисная логика)
    со всеми этими функциями (добавить, изменить, получить список)

    проверка введеннных данных из консоли обязательна

    работа с меню через свич*/
    protected int height;
    protected int weight;
    protected String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void walk() {
        System.out.println(this.name + " is walking\n");
    }

    public void talk() {
        System.out.println(this.name + " is talking\n");
    }

    public void drooling() {
        System.out.println("Только ребенок может пускать слюни\n");
    }

    public void drink() {
        System.out.println("Только студент может попить пива\n");
    }

    public void dontPass() {
        System.out.println("Только студент может не сдать экзамен\n");
    }

    public void passExam(String next) {
        System.out.println("Только студент может сдать экзамен\n");
    }

    public void walkToJob() {
        System.out.println("Только взрослый должен ходить на работу\n");
    }

    public void catchPrihod() {
        System.out.println("Только горгулья ловит приход\n");
    }

    @Override
    public String toString() {
        return "{Человек: имя: " + this.name + ", вес: " + this.weight +", рост: " + this.height+"}";
    }

}


