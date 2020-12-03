package OverloadedMethod;

//overloaded methods that share the same name but have different parameters
// method name + parameters = method signature

public class Main {

    public static void main(String[]args) {

//        add(1,2);
//        add(1,2,3);
//        add(1,2,3,4);

        double x = add(1.5,2,2,3);
        System.out.println(x);

    }

    static int add(int a, int b) {
        System.out.println(("This is overloaded method #1 "/* + (a+b)*/));
        return a+b;

    }

    static int add(int a, int b,int c) {
        System.out.println(("This is overloaded method #2 " /*+ (a+b+c)*/));
        return a+b+c;
    }

    static int add(int a, int b,int c, int d) {
        System.out.println(("This is overloaded method #3 "/* + (a+b+c+d)*/));
        return a+b+c+d;
    }

    static double add(double a, double b) {
        System.out.println(("This is overloaded method #4 "/* + (a+b)*/));
        return a+b;

    }

    static double add(double a, double b, double c) {
        System.out.println(("This is overloaded method #5 " /*+ (a+b+c)*/));
        return a+b+c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println(("This is overloaded method #6 "/* + (a+b+c+d)*/));
        return a+b+c+d;
    }
}
