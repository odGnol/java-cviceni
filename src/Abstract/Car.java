package Abstract;

public class Car extends Vehicle {

    //forced from parent
    @Override
    void go() {
        System.out.println("The car is going to...");
    }
}
