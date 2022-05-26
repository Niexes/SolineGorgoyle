package com.company;

import java.io.IOException;
import java.util.Scanner;
//Сделай так, чтобы во время прихода больше 0.5 рост и вес горгульи был 0 (по умолчанию приход 0)
public class SolineGorgoyle extends Human {
    private double Solenost; //TODO поля с маленькой буквы

    public void setSolenost(double solenost) throws IOException {
        if (solenost <=1.0 && solenost>=0.0) {
            Solenost =  solenost;
        } else {
            throw new IOException("Соленость может принимать значения от 0 до 1 double");

        }
    }
//TODO  модификатор доступа
    double getSolenost() {
        return Solenost;
    }

    //TODO тебе не нужен prihodDefault
    //у тебя уже есть значение прихода как поле в этом классе, просто изначально поставь его в 0 в конструкторе
    int SlovitPrihod(double prihod) {//TODO методы с маленькой буквы
        int prihodDefault = 0;
        if (prihod != 0) {//TODO приходящее число может быть меньше 0
            System.out.println("О блять щас словлю приход");
            if (prihod > 0.5) {//TODO сделай если меньше - возврат с прихода -
                // указывается рандомный рост и вес в пределах каких-то значений, значения выбери сама
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
