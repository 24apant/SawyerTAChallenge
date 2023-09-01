import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args){
         /*
        Create a simple "Guess the Number" game where the computer generates a random number
        between 1 and 100, and the user tries to guess it.
        The program should tell the user if their guess is too high, too low, or correct.
        The user should have a limited number of guesses.
         */

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        //TODO: Your code here

    }
}
