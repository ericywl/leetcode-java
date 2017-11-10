public class Q0110_BalancedBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // my solution
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        boolean balanced = Math.abs(leftHeight - rightHeight) < 2;

        return isBalanced(root.left) && isBalanced(root.right) && balanced;
    }

    private static int helper(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(helper(node.left), helper(node.right));
    }

    // bottom up solution
    public static boolean isBalanced2(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    private static int dfsHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = dfsHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = dfsHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);

        a.left = b;
        a.right = c;
        c.right = d;

        System.out.println(isBalanced(a));
        System.out.println(isBalanced(b));
    }
}
