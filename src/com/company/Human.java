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
    //класс, который содержит описание сущности - это класс модели
    //абстракция используется для классов сервисов - где написана логика, алгоритмы
    //интерфейс хорошо, но все интерфейсы должны быть наречиями (Callable, Serializable)
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
        System.out.println(this.name + " is Walking");
    }

    public void talk() {
        System.out.println(this.name + "Talking");
    }

   public void addStudent() {
        Student st1 = new Student();
        setHeight(sc.nextInt());
        setWeight(sc.nextInt());
        setName(sc.next());
    }
}


