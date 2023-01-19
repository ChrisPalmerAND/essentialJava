package dollar_challenge;

import java.util.Scanner;

public class IsItADollar {

    public static void gatherInformation(Pennies penny, Nickel nickel, Dime dime, Quarter quarter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of pennies you have: ");
        penny.setAmount(Integer.parseInt(scanner.nextLine()));

        System.out.println("Please enter the number of nickels you have: ");
        nickel.setAmount(Integer.parseInt(scanner.nextLine()));

        System.out.println("Please enter the number of dimes you have: ");
        String test = scanner.nextLine();
        int intTest = Integer.parseInt(test);
        dime.setAmount(intTest);

        System.out.println("Please enter the number of quarters you have: ");
        quarter.setAmount(Integer.parseInt(scanner.nextLine()));
    }

    public static void calculateIndividualValues(Pennies penny, Nickel nickel, Dime dime, Quarter quarter) {
        penny.setTotalValue(penny.calculateValue());
        dime.setTotalValue(dime.calculateValue());
        nickel.setTotalValue(nickel.calculateValue());
        quarter.setTotalValue(quarter.calculateValue());
    }

    public static void main(String[] args) {
        Pennies penny = new Pennies();
        Nickel nickel = new Nickel();
        Dime dime = new Dime();
        Quarter quarter = new Quarter();



        gatherInformation(penny, nickel, dime, quarter);
        calculateIndividualValues(penny, nickel, dime, quarter);


        double totalValue = penny.getTotalValue() + dime.getTotalValue() + nickel.getTotalValue() + quarter.getTotalValue();
        String message;
        if(totalValue == 1.0) {message = "Yay well done";}
        else if (totalValue < 1.0) { message = "Not enough";}
        else { message = "Too much!";}
        System.out.println(message);
        }

}
