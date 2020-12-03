package Abstract;

//abstract = abstract classes cannot be instantiated, but they can have a subclass
// abstract method are declared without an implementation

public class Main {

    public static void main(String[]args){

        Car car = new Car();
//        Vehicle vehicle = new Vehicle();

        car.go();

    }

}
