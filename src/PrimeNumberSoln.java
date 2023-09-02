import java.util.HashMap;

public class PrimeNumberSoln {
    private HashMap<Integer, Boolean> table = new HashMap<>();

    public static void printPrimes(int min, int max){
        // This method will print out all prime numbers between min and max, inclusive
        // Note that you should be printing out the values using System.out.println();

        // For an extra hard challenge, try to optimize your code by using memoization (ask Sawyer if you're stuck.)

        //Solution:

        int s = min;
        if(s <= 1){s = 2;} // ensuring the removal of negative numbers, 0, and 1 (can't be primes)
        for(int i = s; i <= max; i++){
            boolean print = true;
            for(int j = 2; j < i/2 + 1; j++){
                if (i % j == 0) {
                    print = false;
                    break;
                }
            }
            if(print && i != 1){
                System.out.println(i);
            }
        }
    }

    public  void printPrimesMemo(int start, int end){
        // Memoization
        // if start is <= 1, start at 2
        int s = start;
        if(start <= 1){s=2;}
        for(int i = s; i <= end; i++){
            if(table.containsKey(i) && table.get(i)){
                System.out.println(i);
            }
            else{
                boolean prime = true;
                for(int j = 2; j < i/2 + 1; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                table.put(i, prime);
                if(prime){
                    System.out.println(i);
                }
            }
        }

    }
}
