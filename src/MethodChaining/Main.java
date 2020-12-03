package MethodChaining;

public class Main {

    public static void main(String[] args) {
        String name = "     Lo";

//        name = name.concat("    ng");
//        name = name.toLowerCase();
//        name = name.trim();

        name = name.concat(" Do").toUpperCase().trim();

        System.out.println(name);
    }
}
