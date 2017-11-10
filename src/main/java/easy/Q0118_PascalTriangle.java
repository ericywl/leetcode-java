package easy;

import java.util.ArrayList;
import java.util.List;

public class Q0118_PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        if (numRows < 1) return output;

        List<Integer> helper = new ArrayList<>();
        helper.add(1);
        output.add(helper);

        List<Integer> prevList = helper;
        for (int i = 1; i < numRows; i++) {
            helper = new ArrayList<>();
            helper.add(1);

            for (int j = 1; j < i; j++) {
                helper.add(prevList.get(j - 1) + prevList.get(j));
            }

            helper.add(1);
            output.add(helper);
            prevList = helper;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(generate(6));
    }
}
