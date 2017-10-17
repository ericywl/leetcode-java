import java.util.*;

public class Q0003_LongestUniqueSubstring {
    // able to pass all test except one with Time Limit Exceeded
    // basic idea is there, but execution is not very efficient
    public static int lengthOfLongestSubstringTry(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int substringLength = 0;
        char[] sCharArray = s.toCharArray();
        Set<Character> charInString;

        for (int i = 0; i < s.length() - 1; i++) {
            charInString = new HashSet<>();
            charInString.add(sCharArray[i]);
            int j = i + 1;

            while (j < s.length()) {
                if (charInString.contains(sCharArray[j])) {
                    if (s.substring(i, j).length() > substringLength) {
                        substringLength = s.substring(i, j).length();
                    }

                    break;
                }

                charInString.add(sCharArray[j]);
                j++;
            }

            if (j == s.length()) {
                if (s.substring(i, j).length() > substringLength) {
                    substringLength = s.substring(i, j).length();
                }
            }
        }

        return substringLength;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }

        char[] sCharArray = s.toCharArray();
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxSubstringLength = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (charIndexMap.containsKey(sCharArray[i])) {
                j = Math.max(j, charIndexMap.get(sCharArray[i]) + 1);
            }

            charIndexMap.put(sCharArray[i], i);
            maxSubstringLength = Math.max(maxSubstringLength, i - j + 1);
        }

        return maxSubstringLength;
    }

    public int lengthOfLongestSubstringAns(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character

        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dcvdfghkn"));
    }
}
