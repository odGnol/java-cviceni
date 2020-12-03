package Encapsulation;

public class Main {

    public static void main (String[]args) {

        Car car = new Car("Chevrolet", "Camero", 2039);

        car.setYear(2020);
        System.out.println(car.getYear());

    }
}
