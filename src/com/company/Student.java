package com.company;

public class Student extends Human{
   private int Dolgi;//TODO сделай долги списком из строк


    void setDolgi(int dolgi) {
      Dolgi = dolgi;
   }
   int getDolgi() {
       return this.Dolgi;
   }
   void drink() {
      System.out.println("Щас бы попить пивасика");
   }
   //Для студента вес пусть снижается на 1кг при получении хвоста, и увеличивается при удалении оного

   int RaschetHvostov() {//TODO методы с маленькой буквы, модификатор доступа методов (проверить везде) (private public)
      int NewWeightStudent = getWeight();//а если рост не указан?
      if (getDolgi() >= 1) {
         for (int i = 1; i <= getDolgi(); i++) {
            NewWeightStudent = getWeight() - 1;
         }
      }
      return NewWeightStudent;
   }
    //TODO соответственно  - добавить долг как строку, убрать долг по имени
   void slovitHvost() {
       int poluchit=getDolgi()-1;
   }
   void sdatHvost() {
       int sdat = getDolgi()+1;//внутри используй поле, а не метод

   }
}
//TODO проверить везде - this.dolgi = dolgi, this.height = height
