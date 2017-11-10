package easy;

public class Q0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(first) != 0) {
                first = first.substring(0, first.length() - 1);
            }
        }

        return first;
    }
}
