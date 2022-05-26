package com.company;

import java.io.IOException;
import java.util.Scanner;
//Сделай так, чтобы во время прихода больше 0.5 рост и вес горгульи был 0 (по умолчанию приход 0)
public class SolineGorgoyle extends Human {
    private double Solenost;

    public void setSolenost(double solenost) throws IOException {
        if (solenost <=1.0 && solenost>=0.0) {
            Solenost =  solenost;
        } else {
            throw new IOException("Соленость может принимать значения от 0 до 1 double");

        }
    }

    double getSolenost() {
        return Solenost;
    }

    int SlovitPrihod(double prihod) {
        int prihodDefault = 0;
        if (prihod != 0) {
            System.out.println("О блять щас словлю приход");
            if (prihod > 0.5) {
                setHeight(0);
                setWeight(0);
                Solenost = (int) prihod;
            }
        } else {
            return prihodDefault;
        }
        return (int) Solenost;
    }
}
