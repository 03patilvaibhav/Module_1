package com.company;

class biker {
    public static void main(String[] args) {
        float b1=30, b2=35, b3=40,b4=50,b5=60,average;
        average=b1+b2+b3+b4+b5/5;
        System.out.println("Average=" +average);
        if(b1>average)
           System.out.println("b1 qualifies");
       else if(b2>average)
           System.out.println("b2 qualifies");
       else if (b3>average)
           System.out.println("b3 qualifies");
       else if(b4>average)
          System.out.print("b4 qualifies");
       else if(b5>average)
          System.out.println("b5 qualifies");
        if(b1<average && b2<average && b3<average && b4<average && b5<average)
          System.out.println("Nobody qualifies");
}
}