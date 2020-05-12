package ru.progwards.java1.lessons.basics;

public class Astronomy {
   public static double PI = 3.14;
     public static Double sphereSquare(Double r) {
        Double s;
               s = 4 * PI * (r*r);
        return s;};
        public static Double earthSquare() {
            double z;
            z = sphereSquare (6371.2);
            return z;
        }
    public static Double mercurySquare(){
        double m;
        m = sphereSquare (2439.7);
        return m;
    }
    public static Double jupiterSquare() {
        double u;
        u = sphereSquare (71492.0);
        return u;
    }

    public static Double earthVsMercury() {
           double n;
           n =  earthSquare()/mercurySquare();
          return n;
    }

    public static Double earthVsJupiter() {
            double k;
            k = earthSquare()/jupiterSquare();
            return k;
    }

       public static void main(String[] args) {
        System.out.println(earthSquare() );
            System.out.println(mercurySquare () );
        System.out.println(jupiterSquare () );
        System.out.println(earthVsMercury () );
        System.out.println(earthVsJupiter () );

    }}
