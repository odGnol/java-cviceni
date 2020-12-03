package StringMethod;

public class Main {

    public static void main (String[]args){


        String name = "Lo";

//        boolean result1 = name.equals("Lo");
//        boolean result2 = name.equalsIgnoreCase("LO");
//        int result = name.length();
//        char result = name.charAt(1);
//        int result = name.indexOf("o");
//        boolean result = name.isEmpty();

        String result = name.replace("o", "i");

        System.out.println(result);
    }
}
