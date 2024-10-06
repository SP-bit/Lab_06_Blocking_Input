import  java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        int number = generator.nextInt(10) + 1;
        Scanner in = new Scanner(System.in);
        int guess = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Guess a number between 1-10 : ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if(guess < 1)
                {
                    System.out.println("Invalid guess (1-10 only)");
                }
                else if (guess > 10)
                {
                    System.out.println("Invalid guess (1-10) only");
                }
                else
                {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYour guess was: " + trash);
                System.out.println("Enter a valid guess within 1-10!");
            }
        } while (!done);
        if(number > guess) {
            System.out.print("Your number is too low!");
        }
        else if(number < guess)
        {
            System.out.print("Your number is too high!");
        }
        else {
            System.out.print("You guessed the number!");
        }
    }
}