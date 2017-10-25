import java.util.ArrayList;
import java.util.List;

public class Q0107_BinaryTreeLevelTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return new ArrayList<>();
    }

    private List<Integer> currentLevel(TreeNode root) {
        List<Integer> outputList = new ArrayList<>();
        outputList.add(root.left.val);
        outputList.add(root.right.val);

        return outputList;
    }
}
