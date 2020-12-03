package ArrayList;

//ArrayList - a resizable array, elements can be added and removed after compilation phase, store reference data types

import java.util.ArrayList;

public class Main {

    public static void main (String []args) {


        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("noodle");
        food.add("soup");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for(int i = 0; i < food.size();i++) {
            System.out.println(food.get(i));
        }


    }
}
