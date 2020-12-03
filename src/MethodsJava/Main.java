package MethodsJava;

public class Main {

    public static void main(String[]args) {

        int x = 3;
        int y = 4;

//        int sum = add(x,y);
        System.out.println(add(x,y));
//        String name = "Lo";
//        int age = 99;
//        hello(name, age);

    }
//
//    static void hello(String name, int age) {
//        System.out.println("Hello, " + name + ". I am " + age + " year´s old.");

    //the variable sum is not the same sum at the method in main, they could be name differently
    static int add(int x, int y) {

//        int sum = x+y;
//        return sum;

        return x+y;
    }
}
