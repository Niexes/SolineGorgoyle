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
        System.out.println(this.name + " is walking");
    }

    public void talk() {
        System.out.println(this.name + " is talking");
    }

    public void drooling() {
    }

    public void drink() {

    }

    public void dontPass(String next) {

    }

    public void passExam(String next) {

    }

    public void walkToJob() {

    }

    public void catchPrihod() {

    }

    public void addStudent() {
        Student st1 = new Student();
        setHeight(sc.nextInt());
        setWeight(sc.nextInt());
        setName(sc.next());
    }
    @Override
    public String toString() {
        return "Human name " + this.name + ", " + " human weight " + this.weight + ", " + " human height " + this.height;
    }

}


