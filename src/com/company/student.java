package com.company;
class marks{
    double maths, english, science,marathi,history;


}
public class student {
    public static void main (String[] args){
         marks M =  new marks();
         double avg;

         M.maths=90;
         M.english=70;
         M.science=80;
         M.marathi=65;
         M.history=76;

         avg=(M.marathi+M.maths+M.science+M.english+M.history/5);
         System.out.println("Average is:" +avg);
    }
}
