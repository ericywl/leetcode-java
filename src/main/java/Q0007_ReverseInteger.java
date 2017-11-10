public class Q0007_ReverseInteger {
    public static int reverseTry(int x) {
        if (x == 0) {
            return 0;
        }

        double power = Math.floor(Math.log10(Math.abs(x)));
        int nextHighestDigit = (int) (Math.abs(x) % 10 * Math.pow(10, power));

        if (x < 0) {
            return -nextHighestDigit + reverseTry(x / 10);
        }

        return nextHighestDigit + reverseTry(x / 10);
    }

    public static int reverse(int x) {
        int output = 0;

        while (x != 0) {
            int leastSig = x % 10;
            int newOutput = output * 10 + leastSig;
            if ((newOutput - leastSig) / 10 != output) {
                return 0;
            }

            output = newOutput;
            x = x / 10;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
}
