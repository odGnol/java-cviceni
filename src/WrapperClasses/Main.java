package WrapperClasses;

//wrapper class: provides a way to use primitive data types as reference data types
//reference data types contain useful methods
//can be used with collections (ex. ArrayList)
//wrapper: Boolean, Character, Integer, Double
//primitive: boolean, char, int, double
//autoboxing x unboxing

public class Main {

    public static void main (String []args) {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 4.15;
        String e = "Lo";

        if(a == true) {
            System.out.println("This is true.");
        }
    }
}
