package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean d  = (c < (a+b) & a < (c+b) & b < (c+a)) ;
        return d;

    }
    public static boolean isRightTriangle(int a, int b, int c) {
        boolean n = false;
        if (c > a & c > b) {
            n = (c * c == (a * a + b * b));}
        else {if (a > b & a > c)
                n = (a * a == (c * c + b * b));
        else {if (b > a & b > c)
                 n = (b * b == (c * c + a * a));
            }}
        return n; }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean d  = (c == a || a==b || b==c) ;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(isRightTriangle(4, 3,5));
        System.out.println(isTriangle(4, 2,3));
        System.out.println(isIsoscelesTriangle (5, 5,5));
    }}
