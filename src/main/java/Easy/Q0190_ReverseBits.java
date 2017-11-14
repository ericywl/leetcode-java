package easy;

public class Q0190_ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // shift left result, equivalent to multiply 2
            result = result << 1;
            // get LSB
            if ((n & 1) == 1)
                result++;

            // shift right n, equivalent to divide by 2
            n = n >> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}
