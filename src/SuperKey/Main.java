package SuperKey;

//super = keyword refers to the superclass(parent) of an object, very similar to the "this" keyword

public class Main {

    public static void main (String[]args) {

        Hero hero1 = new Hero("Batman", 43, "Money");
        Hero hero2 = new Hero("Superman", 100, "Everything");

//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);

        System.out.println(hero2);

    }
}
