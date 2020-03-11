package com.company.wrapper;

class BoxingDemo {

    public static void method1(Integer no){//number 5 passed is boxed to Integer value

        System.out.println(no);
 }

public static void main(String[] args) {


        new BoxingDemo().method1(5);//int is passed to a method which expects Integer

    Integer num1 = new Integer(10);

    int num2 = num1;      //Auto -unboxing

    int num3 = num1.intValue();  //converting Integer to int using intValue()

    }

}
