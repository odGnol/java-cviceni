package ArrayList;
import java.util.*;

//2DArrayList - a dynamic list of lists
// you can change the size during runtime

public class Main2 {

    public static void main (String [] args){

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("salt");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("kofola");
        drinkList.add("wine");

        System.out.println(bakeryList);
        System.out.println(bakeryList.get(0));
        System.out.println(produceList);
        System.out.println(drinkList);

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(2).get(1));

    }
}
