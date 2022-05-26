package com.company;

public class Student extends Human{
   private int Dolgi;

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

   int RaschetHvostov() {
      int NewWeightStudent = getWeight();
      if (getDolgi() >= 1) {
         for (int i = 1; i <= getDolgi(); i++) {
            NewWeightStudent = getWeight() - 1;
         }
      }
      return NewWeightStudent;
   }
   void slovitHvost() {
       int poluchit=getDolgi()-1;
   }
   void sdatHvost() {
       int sdat = getDolgi()+1;

   }
}
