package Static;

/*
static: modifier, a single copy of a variable/method is created and shared, the class owns the static member
 */

import static Static.Friend.displayFriends;

public class Main {

    public static void main (String[] args) {

        Friend friend1 = new Friend("Sponge");
        Friend friend2 = new Friend("Heidi");
        Friend friend3 = new Friend("Lupin");
        Friend friend4 = new Friend("Goro");

//        System.out.println(Friend.numberOfFriends);

        displayFriends();

    }
}
