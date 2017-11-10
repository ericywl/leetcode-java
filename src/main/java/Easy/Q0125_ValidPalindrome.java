package easy;

public class Q0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String newS = s.replaceAll("[\\W]", "").toLowerCase();
        int len = newS.length();

        for (int i = 0; i < len / 2; i++) {
            if (newS.charAt(i) != newS.charAt(len - i - 1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
