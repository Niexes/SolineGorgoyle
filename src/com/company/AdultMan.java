package com.company;

public class AdultMan extends Human{
   private int zarplata;

    AdultMan(int w, int h) {
        setWeight(w);
        setHeight(h);
    }


    void setZarplata(int zarplata) {
        this.zarplata = zarplata;
    }

    public int getZarplata() {
        return zarplata;
    }



    public void WalkToJob() {
        System.out.println("Опять на ебанную работу идти");
    }
}
