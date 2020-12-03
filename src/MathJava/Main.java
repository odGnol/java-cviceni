package MathJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x;
        double y;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        hypotenuse = Math.sqrt(x*x + y*y);

        System.out.println(hypotenuse);

        scanner.close();

/*
    exercises
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double k = Math.min(x, y);
        double l = Math.abs(y);
        double m = Math.sqrt(x);
        double n = Math.round(x);
        double o = Math.ceil(x);
        double p = Math.floor(x);

        System.out.println("Maximum z dvojice čísel je: " + z);
        System.out.println("Minimum z dvojice čísel je" + k);
        System.out.println("Absolutní hodnota je: " + l);
        System.out.println("Druhá odmocnina je: " + m);
        System.out.println("round: " + n + " ceil: " + o + " floor: " + p);*/
    }
}
