package com.company;

import java.io.IOException;
import java.util.Scanner;
//Сделай так, чтобы во время прихода больше 0.5 рост и вес горгульи был 0 (по умолчанию приход 0)
public class SolineGorgoyle extends Human {
    private double solenost;


    public void setSolenost(double solenost) throws IOException {
        if (solenost <=1.0 && solenost>=0.0) {
            this.solenost =  solenost;
        } else {
            throw new IOException("Соленость может принимать значения от 0 до 1 double");

        }
    }
   public double getSolenost() {
        return solenost;
    }

    //у тебя уже есть значение прихода как поле в этом классе, просто изначально поставь его в 0 в конструкторе
    // Маша: я не поняла что ты имеешь в виду, где значение прихода как поле в этом классе? есть не приход,  а соленость, разные вещи
   public int catchPrihod(double prihod) {
        if (prihod != 0) {//TODO приходящее число может быть меньше 0 //Маша: ну окей
            System.out.println(getName() + " say: о блять щас словлю приход");
            if (prihod > 0.5) {
                setHeight(0);
                setWeight(0);
                solenost = (int) prihod;
            }
            //TODO сделай если меньше - возврат с прихода -
            // указывается рандомный рост и вес в пределах каких-то значений, значения выбери сама
        } else if (prihod < 0 ) {
            int w=0, w1=150, h=120, h1=200;
            int newWeight = w + (int) (Math.random() * w1);
            int newHeight = h + (int) (Math.random() * h1);
            setWeight(newWeight);
            setHeight(newHeight);
            solenost = (int) prihod;
        }
        return (int) solenost;
    }
}
