import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Guess the number: ");
        int user = 0;
        int points = 0;
        int max = 100;
        int min = 1;
        Random random = new Random();
        int randomNumber = random.nextInt(max) + min;
        int maxAttempts = 3;
        int round = 1;

        System.out.println("Number Guessing Game....");

        while (round <= 3) {
            System.out.println("Round: "+ round);
            int attempts = 1;

            while (attempts <= maxAttempts) {
                System.out.println("Attempt numbers is " + attempts);
                System.out.println("Guess the number: ");
                user = sc.nextInt();
                if (user == randomNumber) {
                    System.out.println("Congratulation...you got the right number");
                    points = 100;
                    int score = points * attempts;
                    System.out.println("You got " + points + " points and got the number in " + attempts + " attempts");
                    System.out.println("Your score is : "+ score);
                    break;
                } else if (user < randomNumber) {
                    System.out.println("Your guess is too low, Try again");
                } else {
                    System.out.println("Your guess is too high, Try again");
                }
                if (attempts == maxAttempts) {
                    System.out.println("Sorry...all your attempts are over.");
                }
                attempts++;

            }
            round++;
        }
    }
}
