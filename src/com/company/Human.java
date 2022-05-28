package com.company;

class Human implements Skillable {
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
}


