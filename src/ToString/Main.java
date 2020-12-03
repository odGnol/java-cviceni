package ToString;

//special method that all objects inherit, that returns a string that textually represents an object,
// can be used both implicitly and explicitly

public class Main {

    public static void main (String[]args){


        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println("_________________________");
        System.out.println(car);
        System.out.println("_________________________");
        System.out.println(car.toString());

    }
}
