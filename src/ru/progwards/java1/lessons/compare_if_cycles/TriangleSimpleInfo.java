package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c) {
        int d=0;
        if (c >= a && c >= b) {
            d = c; }
        else {if  (a >= b && a >= c)
            d = a;
        else {if  (b >= a && b >= c)
            d = b;}}
        return d;
        }
    public static int minSide(int a, int b, int c) {
        int d  = 0;
        if (c <= a && c <= b) {
            d = c;}
        else {if  (a <= b && a <= c)
            d = a;
        else {if  (b <= a && b <= c)
            d = b;}}
        return d;
    }
    public static boolean isEquilateralTriangle (int a, int b, int c) {
        boolean d  = (c == a && c == b) ;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(5, 5,3));
        System.out.println(minSide(3, 4,3));
        System.out.println(isEquilateralTriangle(5, 4,3));
        System.out.println(isEquilateralTriangle(5, 5,5));
}}
