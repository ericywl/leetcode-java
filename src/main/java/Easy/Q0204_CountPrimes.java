package easy;

public class Q0204_CountPrimes {
    public static int countPrimes(int n) {
        boolean prime[] = new boolean[n];
        // alternatively, you can change prime[] to notPrime[] and
        // reverse all the boolean to skip initialization
        for (int i = 2; i < n; i++)
            prime[i] = true;

        // sieve of eratosthenes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
                for (int j = 2; i * j < n; j++)
                    prime[i * j] = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(5));
    }
}
