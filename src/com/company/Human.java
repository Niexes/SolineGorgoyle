package com.company;
/*Опиши мне иерархию следующую: должны быть классы - взрослый, ребенок, студент и солевая горгулья
        Каждый должен уметь ходить, говорить (выводы на экран)
        Взрослый ходит на работу
        Ребенок пускает слюни
        Студент пьет пиво
        Солевая горгулья ловит приход
//делаешь пока просто вывод на экран текста
        Далее - опиши у каждого поля рост, вес
        Взрослому зарплату
        Ребёнку номер телефона
        Студенту список хвостов
        Горгулье степень солености (число от 0 до 1)
        Всем геттеры, сеттеры
        Инкапсуляция это по сути геттеры сеттеры
Обычно их делают стандартными
Сделай так, чтобы во время прихода больше 0.5 рост и вес горгульи был 0 (по умолчанию приход 0)
Для взрослого указание роста и веса только через конструктор при создании
Для студента вес пусть снижается на 1кг при получении хвоста, и увеличивается при удалении оного*/

class Human implements Skillable {
    //класс, который содержит описание сущности - это класс модели
    //абстракция используется для классов сервисов - где написана логика, алгоритмы
    //интерфейс хорошо, но все интерфейсы должны быть наречиями (Callable, Serializable)
    private int height;
    private int weight;
    private String name;


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
        System.out.println(getName() + " is Walking");
    }

    public void talk() {
        System.out.println(getName() + "Talking");
    }
}


