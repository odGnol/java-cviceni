package Arrays_size;

import java.util.LinkedList;

public class Main {

    public static void main (String [] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Jesus.");
        list.add("Buddha.");
        list.add("God.");
        list.add("Dalaliama");
        list.add("saints");
        list.add("30");
        list.add("28");

        System.out.println("Linkedlist: " + list);
        System.out.println("The size of the linked list is: " + list.size());


    }
}
