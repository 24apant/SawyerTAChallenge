import java.util.HashMap;

public class PrimeNumberGenerator {
    HashMap<Integer, Boolean> table = new HashMap<>();
    public static void printPrimes(int min, int max){
        // This method will print out all prime numbers between min and max, inclusive
        // Note that you should be printing out the values using System.out.println();


        // YOUR CODE HERE

    }

    public void printPrimesMemo(int start, int end){
        // For an extra hard challenge, try to optimize your code by using memoization (ask Sawyer if you're stuck.)
        // Hint for memoization: use the instance variable :)


        // YOUR CODE HERE

    }

    public static void main(String[] args){
        // tests for printPrimes
        System.out.println("Test 1: 1 to 11\n");
        System.out.println("Expected:");
        System.out.println("----------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("5");
        System.out.println("7");
        System.out.println("11");
        System.out.println();

        System.out.println("Got:");
        System.out.println("-----------");
        printPrimes(1, 11);
        System.out.println("\n\n");



        System.out.println("Test 2: -1 to 31\n");
        System.out.println("Expected:");
        System.out.println("----------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("5");
        System.out.println("7");
        System.out.println("11");
        System.out.println("13");
        System.out.println("17");
        System.out.println("19");
        System.out.println("23");
        System.out.println("29");
        System.out.println("31");
        System.out.println();

        System.out.println("Got:");
        System.out.println("-----------");
        printPrimes(-1, 31);
        System.out.println("\n\n");

        // tests for Memoization
        PrimeNumberGenerator prime = new PrimeNumberGenerator();
        System.out.println("Test 1 Memoization: 1 to 11\n");
        System.out.println("Expected:");
        System.out.println("----------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("5");
        System.out.println("7");
        System.out.println("11");
        System.out.println();

        System.out.println("Got:");
        System.out.println("-----------");
        prime.printPrimesMemo(1, 11);
        System.out.println();


        System.out.println("Test 2 Memoization: -1 to 31\n");
        System.out.println("Expected:");
        System.out.println("----------");
        System.out.println("2");
        System.out.println("3");
        System.out.println("5");
        System.out.println("7");
        System.out.println("11");
        System.out.println("13");
        System.out.println("17");
        System.out.println("19");
        System.out.println("23");
        System.out.println("29");
        System.out.println("31");
        System.out.println();

        System.out.println("Got:");
        System.out.println("-----------");
        prime.printPrimesMemo(-1, 31);

    }
}

