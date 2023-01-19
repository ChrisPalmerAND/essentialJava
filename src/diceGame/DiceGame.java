package diceGame;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Die die = new Die();
        Player player = new Player();
        Board board = new Board();
        int numberOfRolesAllowed = 5;
        int numberOfRolls = 0;
        String message;


        do {
                numberOfRolls = numberOfRolls + 1;
                if(player.getTotalPlacesMoved() < board.getSpaces()) {

                    int value = die.getDieValue();
                    int currentPlacesMoved = player.getTotalPlacesMoved();
                    player.setTotalPlacesMoved(value + currentPlacesMoved);
                    System.out.printf("Roll #%d: %d \n", numberOfRolls, player.getTotalPlacesMoved());
                }
            }
        while (numberOfRolls < numberOfRolesAllowed);

        if(player.getTotalPlacesMoved() == board.getSpaces()){
            message = "Yay you win";
        } else if (player.getTotalPlacesMoved() < board.getSpaces()) {
            message = "Sorry you didn't make 20 in 5 rolls.";
        } else {
            message = "Sorry you exceeded the limit of 20";
        }
        System.out.println(message);
}
}
