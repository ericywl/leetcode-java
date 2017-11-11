package Easy;

public class Q0191_NumOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1)
                count++;

            n = n >> 1;
        }

        return count;
    }
}
