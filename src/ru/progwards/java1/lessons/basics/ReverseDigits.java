package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a;
        int b;
        int c;
        int z;
        String y;
        String m;
        String n;
        String k;
a = number % 10;
b = (number / 10) % 10;
c = number / 100;
y = Integer.toString(c);
m = Integer.toString(b);
n = Integer.toString(a);
k = n + m + y;
z = Integer.parseInt(k);
        return z;
    }
    public static void main(String[] args) {
               System.out.println(reverseDigits (869));
    }
}
