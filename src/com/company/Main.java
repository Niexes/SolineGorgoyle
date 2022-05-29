package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*1. сделать считывание имен и других данных через консоль

   2.  в консоли будет приложение с менюшкой, пользователю на консоль выводится меню с цифрами, он вводит цифру, отсюда пляшем
   работа с меню через свич
-добавить чувака (открывается выбор какого чувака добавить)
-список чуваков
-изменить данные чувака

   3. должен быть класс обработчик (сервисная логика) со всеми этими функциями (добавить, изменить, получить список)

   4. проверка введеннных данных из консоли обязательна
*/

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Menu newMenu = new Menu();
        Base base = new Base();
        newMenu.showMenu(base);

    }
}
