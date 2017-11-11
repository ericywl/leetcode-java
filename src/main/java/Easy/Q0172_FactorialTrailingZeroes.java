package Easy;

public class Q0172_FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        if (n == 0) return 0;

        return n / 5 + trailingZeroes(n / 5);
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));
    }
}
