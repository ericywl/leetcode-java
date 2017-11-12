package Easy;

public class Q0205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] sArray = new int[256];
        int[] tArray = new int[256];

        for (int i = 0, len = s.length(); i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sArray[sChar] != tArray[tChar])
                return false;

            sArray[s.charAt(i)] = i + 1;
            tArray[t.charAt(i)] = i + 1;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphic("aba", "baa"));
    }
}
