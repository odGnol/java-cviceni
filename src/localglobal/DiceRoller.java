package localglobal;

import java.util.Random;

public class DiceRoller {

    /*#2
    declaring arguments outside of the constructor
*/

    Random random;
    int number;

    DiceRoller() {

        random = new Random();

        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

/*

#1 one way how to pass arguments to method outside of the constructor, local declaring
    Random random = new Random();
    int number = 0;
    roll(random, number);
}

    void roll(Random random, int number) {
            number = random.nextInt(6) + 1;
            System.out.println(number);
            }*/
