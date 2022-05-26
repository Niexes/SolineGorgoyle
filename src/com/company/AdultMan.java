package com.company;

public class AdultMan extends Human {
    private int zarplata;

    AdultMan(int w, int h) {//TODO модификатор доступа
        setWeight(w);
        setHeight(h);
    }

    //TODO модификатор доступа, хули он у гета есть а у сета нет?
    void setZarplata(int zarplata) {
        this.zarplata = zarplata;
    } //TODO не zarplata а по английски нормально пишите salary

    public int getZarplata() {
        return zarplata;
    }

    public void WalkToJob() {
        System.out.println("Опять на ебанную работу идти");
    }

    //TODO все классы отформатировать - ctr+alt+l, убрать лишние строки
    //TODO между методами - 1 строка
}
