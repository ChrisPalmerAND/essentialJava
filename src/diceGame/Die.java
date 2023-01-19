package diceGame;

import java.util.Random;

public class Die {
    private int numberOfSides = 6;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getDieValue(){
        Random random = new Random();
        return random.nextInt(getNumberOfSides()) + 1;
    }
}
