package easy;

public class Q0013_RomanInteger {
    public static int romanToInt(String s) {
        int output = 0;

        if (s.contains("IV")) output -= 2;
        if (s.contains("IX")) output -= 2;
        if (s.contains("XL")) output -= 20;
        if (s.contains("XC")) output -= 20;
        if (s.contains("CD")) output -= 200;
        if (s.contains("CM")) output -= 200;

        for (char roman : s.toCharArray()) {
            if (roman == 'M') output += 1000;
            if (roman == 'D') output += 500;
            if (roman == 'C') output += 100;
            if (roman == 'L') output += 50;
            if (roman == 'X') output += 10;
            if (roman == 'V') output += 5;
            if (roman == 'I') output += 1;
        }

        return output;
    }
}
