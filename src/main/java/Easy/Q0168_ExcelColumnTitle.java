package easy;

public class Q0168_ExcelColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder title = new StringBuilder();

        while (n != 0) {
            n--;
            int remainder = n % 26 ;
            title.append((char) (remainder + 'A'));

            n = n / 26;
        }

        return title.reverse().toString();
    }

    public static String convertToTitleRecur(int n) {
        if (n == 0) return "";

        return convertToTitleRecur((--n) / 26) + (char) ((n) % 26 + 'A');
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitleRecur(26));
    }
}
