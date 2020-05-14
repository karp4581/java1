package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static double U = 1.61903d;
    public static double T = 1.61703d;

    public static boolean containsDigit(int number, int digit) {
        int k;
        do {
            k = number % 10;

            if (k == digit)
                return true;
            number = number / 10;
        }
        while (number > 0);
        return false;
    }

    public static int fiboNumber(int n) {
        int prev = 0, next = 1, result = 1;
        for (int i = 1; i < n; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        boolean n = false;
        if (c > a & c == b)
            n = (c / a <= U && b / a >= T);
        else if (a > b & a == c)
            n = (c / b <= U && a / b >= T);
        else if (b > c & b == a)
            n = (c / b <= U && a / b >= T);
        return n;
    }


    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        System.out.println(fiboNumber(0));
        System.out.println(fiboNumber(1));
        System.out.println(fiboNumber(2));
        int prev = 0, next = 1, result;
        for (int i = 1; i < 15; i++) {
            result = prev + next;
            prev = next;
            next = result;
            System.out.println(result + " " + prev + " " + prev);
            System.out.println(isGoldenTriangle(result, prev, prev));
        }


    }

}
