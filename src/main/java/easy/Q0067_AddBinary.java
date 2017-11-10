package easy;

public class Q0067_AddBinary {
    public static String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) {
            return "0";
        }

        String aNew = a;
        String bNew = b;
        int aLen = a.length();
        int bLen = b.length();

        if (aLen > bLen) {
            bNew = String.format("%1$" + aLen + "s", bNew).replace(' ', '0');
        } else {
            aNew = String.format("%1$" + bLen + "s", aNew).replace(' ', '0');
        }

        char[] c1 = aNew.toCharArray();
        char[] c2 = bNew.toCharArray();

        StringBuilder sumStr = new StringBuilder();
        int carry = 0;

        for (int len = aNew.length(), i = len - 1; i > -1; i--) {
            int sum = carry;
            int num1 = c1[i] - '0';
            int num2 = c2[i] - '0';

            sum += (num1 + num2);
            carry = sum / 2;
            sumStr.append(sum % 2);
        }

        if (carry != 0) {
            sumStr.append(carry);
        }

        return sumStr.reverse().toString();
    }

    public String addBinaryAns(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary(a, b));
    }
}
