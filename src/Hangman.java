import java.util.Scanner;
import java.util.Random;

/**
 * Hangman Game Assignment
 * -----------------------
 * Your task is to implement a simple Hangman game in Java. Hangman is a word-guessing game
 * where the player tries to guess a hidden word one letter at a time. The player can make
 * a limited number of wrong guesses before losing the game.
 *
 * Assignment Details:
 * - You are provided with a partially completed Hangman game program.
 * - Your goal is to fill in the missing parts of the code to make it a functional game.
 *
 * Here are the key components you need to implement:
 * 1. displayWord: Display the current state of the word (with underscores for unrevealed letters).
 * 2. checkGuess: Check if a guessed letter is in the word and update the game state accordingly.
 * 3. isGameFinished: Determine if the game is over (win or lose).
 * 4. Implement the game loop and user input.
 *
 * Instructions:
 * 1. Look for the "TODO" comments in the code to identify areas where you need to write code.
 * 2. Follow the comments and instructions to complete the missing parts.
 * 3. Test your program to ensure it works as expected.
 *
 * Optional Enhancements (Extra Credit):
 * - Implement additional features such as a menu, scoring, or custom word lists.
 * - Improve the user interface with ASCII art for the hangman or additional graphics.
 *
 * Good luck, and have fun building your Hangman game!
 */


public class Hangman {
    public static void main(String[] args) {
        // Welcome to the Hangman Game!
        System.out.println("Welcome to Hangman Game!");
        System.out.println("Try to guess the hidden word. You can make 6 wrong guesses.");

        // Fill in the list (it's technically called an Array but you'll learn more about those later)
        // with words to choose from
        String[] wordList = {"example", "words", "to", "choose", "from"};

        // Choose a random word from the list.
        String secretWord = getRandomWord(wordList);

        // Initialize variables for the game.
        int maxWrongGuesses = 6;
        int wrongGuesses = 0;
        boolean[] guessedLetters = new boolean[secretWord.length()];
        boolean isGameOver = false;

        // Create a Scanner object to get user input.
        Scanner scanner = new Scanner(System.in);

        // Start the game loop.
        while (!isGameOver) {
            // Display the current state of the word (with underscores for unrevealed letters).
            displayWord(secretWord, guessedLetters);

            // Get a guess from the player.
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            // TODO: Implement checkGuess function to check if the guessed letter is in the word.
            // TODO: Update guessedLetters array accordingly.
            // TODO: Update wrongGuesses if the guess is incorrect.

            // TODO: Check if the game is over using the isGameFinished function.
        }

        // TODO: Display the final result - win or lose.

        // Close the scanner.
        scanner.close();
    }

    // Function to get a random word from the list.
    public static String getRandomWord(String[] wordList) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordList.length);
        return wordList[randomIndex];
    }

    // TODO: Implement the displayWord function to display the current state of the word.
    public static void displayWord(String secretWord, boolean[] guessedLetters) {
        // TODO: Your code here
    }

    // TODO: Implement the checkGuess function to check if a guessed letter is in the word.
    public static boolean checkGuess(String secretWord, char guess) {
        // TODO: Your code here
        return false;
    }

    // TODO: Implement the isGameFinished function to check if the game is finished (win or lose).
    public static boolean isGameFinished(String secretWord, boolean[] guessedLetters, int wrongGuesses, int maxWrongGuesses) {
        // TODO: Your code here
        return false;
    }
}
