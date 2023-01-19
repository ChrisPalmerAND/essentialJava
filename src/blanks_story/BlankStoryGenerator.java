package blanks_story;

import java.util.Scanner;

public class BlankStoryGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season;
        String adjective;
        String anInteger;

        System.out.println("Enter a season: ");
        season = scanner.nextLine();
        System.out.println(season);

        System.out.println("Enter a adjective: ");
        adjective = scanner.nextLine();
        System.out.println(adjective);

        System.out.println("Enter a whole number: ");
        anInteger = scanner.nextLine();
        System.out.println(anInteger);

        scanner.close();

        String story = "On a " + adjective + " " + season + " day, I drink " + anInteger + " number of coffees.";
        System.out.println(story);
    }
}
