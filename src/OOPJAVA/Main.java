package OOPJAVA;

//object = an instance of a class that may contain attributes(characters of an object) and methods(action that object can perform)

public class Main {

    public static void main (String[]args) {

        Car car = new Car();
        Car myCar = new Car();

        car.broke();
        System.out.println(car.year);
        System.out.println(myCar.price);
    }
}
