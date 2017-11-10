import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0119_PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) return null;

        Integer[] helper = new Integer[rowIndex + 1];
        helper[0] = 1;

        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = i; j > 0; j--) {
                if (helper[j] == null)
                    helper[j] = 0;

                helper[j] += helper[j - 1];
            }
        }

        return new ArrayList<>(Arrays.asList(helper));
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
