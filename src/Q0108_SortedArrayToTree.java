public class Q0108_SortedArrayToTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        return node(nums, 0, nums.length - 1);
    }

    private static TreeNode node(int[] nums, int low, int high) {
        if (low > high) return null;
        if (low == high) return new TreeNode(nums[low]);

        int mid = (high + low) / 2;

        TreeNode parent = new TreeNode(nums[mid]);
        parent.left = node(nums, low, mid - 1);
        parent.right = node(nums, mid + 1, high);

        return parent;
    }
}
