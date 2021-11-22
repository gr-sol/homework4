package org.example;

/**
 * Hello world!
 *
 */
public class Triangle {
    public static double a = 10;
    public static double b = 10;
    public static double c = 8;

    public Triangle(double a, double b, double c){
        this.a =a;
        this.b =b;
        this.c =c;
    }


    public static void main(String[] args) {

        triangle(a, b, c);
    }

    public static void triangle(double a, double b, double c) {
        double sum = a + b + c;
        double p = 0.5 * sum; //полупериметр треугольника
        double h = (2 * (Math.sqrt(p * (p - a) * (p - b) * (p - c)))) / a; // высота опущеная на сторону а
        double s = (a * h) / 2; // площадь
        System.out.println("Площадь треугольника = " + s);

    }

    public static boolean isTriangle() {
        return ((a + b > c) && (b + c > a) && (c + a > b));
    }
}
