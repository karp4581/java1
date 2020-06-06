package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b; String str;
    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return a + "+" + b +"i";
    }

    public ComplexNum add(ComplexNum num) {
       int a1 = a + num.a;
       int b1 =b + num.b;
        return new ComplexNum(a1,b1) ;


    }
    public ComplexNum sub(ComplexNum num) {
        int a1 = a - num.a;
        int b1 =b - num.b;
        return new ComplexNum(a1,b1) ;
    }
    public ComplexNum mul(ComplexNum num) {
        int a1 = (a * num.a) - (b * num.b);
        int b1 =(b * num.a) + (a * num.b);
        return new ComplexNum(a1,b1) ;
    }
    public ComplexNum div(ComplexNum num) {
        int a1 = ((a * num.a) + (b * num.b))/((num.a*num.a) +(num.b*num.b));
        int b1 =((b * num.a) - (a * num.b))/((num.a*num.a) +(num.b*num.b));
        return new ComplexNum(a1,b1) ;
    }

    public static void main(String[] args) {
    ComplexNum complexNum1 = new ComplexNum(10,12);
    ComplexNum complexNum2 = new ComplexNum(6,8);
    System.out.println (complexNum1.add(complexNum2));
        System.out.println (complexNum1.sub(complexNum2));
        System.out.println (complexNum1.mul(complexNum2));
        System.out.println (complexNum1.div(complexNum2));
}}
