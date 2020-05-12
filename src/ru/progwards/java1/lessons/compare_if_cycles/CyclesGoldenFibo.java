package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
public static double U = 1.61903d;
public static double T = 1.61703d;

public static boolean containsDigit(int number, int digit) {
        int i=0; int  k;
        do {i++;
        k = number % 10;
        number=number / 10;
        }
        while (i<number);
        return (k == digit);
        }

public static int fiboNumber(int n) {
        int prev=0, next=1, result=2;
        for (int i = 1; i < n; i++) {
        result=prev+next;
        prev=next;
        next=result;
        }
        return result;
        }
public static boolean isGoldenTriangle(int a, int b, int c) {
        boolean n = false;
        if (c > a & a==b)
        n = (a/c < U || a/c > T);
        else if (a > b & b==c)
        n = (c/a <= U || b/a >= T);
        else if (b > a & a==c)
        n = (c/b <= U || a/b >= T);
        return n; }


public static void main(String[] args) {
        System.out.println(fiboNumber(5));
        int prev = 0, next = 1, result;
        for (int i = 1; i <15; i++) {
        result = prev + next;
        prev = next;
        next = result;
        System.out.println(result + " " + prev + " " + prev);
        System.out.println(isGoldenTriangle(result, prev, prev));
        }

        System.out.println(containsDigit (234567,3));
        }

        }
