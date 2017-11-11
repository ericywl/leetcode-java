package Easy;

public class Q0171_ExcelColumnNum {
    public static int titleToNumber(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.length() - 1 - i;
            int num = (int) Math.pow(26, i) * (s.charAt(index) - '@');
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AA"));
    }
}
