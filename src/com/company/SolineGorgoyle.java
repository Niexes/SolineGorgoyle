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
            throw new IOException("Соленость может принимать значения от 0 до 1 типа double");

        }
    }
   public double getSolenost() {
        return solenost;
    }

   public double catchPrihod(double prihod) {
        if (prihod != 0) {
            System.out.println(this.name + " say: о блять щас словлю приход");
            if (prihod > 0.5) {
                setHeight(0);
                setWeight(0);
                solenost = (int) prihod;
            }
        } else if (prihod < 0 ) {
            int w=0, w1=150, h=120, h1=200;
            int newWeight = w + (int) (Math.random() * w1);
            int newHeight = h + (int) (Math.random() * h1);
            setWeight(newWeight);
            setHeight(newHeight);
            solenost =  prihod;
        }
        return solenost;
    }

    @Override
    public String toString() {
        return "Имя солевой горгульи " + this.name + ", " + " вес солевой горгульи " + this.weight + ", " + " рост солевой горгульи " + this.height;
    }
}
