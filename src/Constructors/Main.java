package Constructors;

//special method that is called when an object is instantiated(created)
//can help with varying of attributes

public class Main {

    public static void main (String[]args){


        Human human1 = new Human("Bára", 29, 65);
        Human human2 = new Human("Long", 32, 80);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();


    }
}
