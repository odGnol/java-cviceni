package Polymorphism;

import AccessModifiers.Package1.B;

public class Main {

    public static void main (String [] args) {

        Car car = new Car ();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

//        car.go();
//        boat.go();
//        bicycle.go();

        for(Vehicle x : racers){

            x.go();
        }

    }
}
