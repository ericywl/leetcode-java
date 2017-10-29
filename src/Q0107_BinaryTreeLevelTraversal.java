import java.util.*;

public class Q0107_BinaryTreeLevelTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "" + val;
        }
    }

    // Using BFS and reversing the list
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> levelOrder = new ArrayList<>();
        List<TreeNode> frontier = new ArrayList<>();
        frontier.add(root);

        while (!frontier.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            List<TreeNode> level = new ArrayList<>();
            List<Integer> levelVal = new ArrayList<>();
            for (TreeNode u : frontier) {
                if (u.left != null && !level.contains(u.left)) {
                    level.add(u.left);
                    next.add(u.left);
                }

                if (u.right != null && !level.contains(u.right)) {
                    level.add(u.right);
                    next.add(u.right);
                }

                levelVal.add(u.val);
            }

            levelOrder.add(levelVal);
            frontier = next;
        }

        Collections.reverse(levelOrder);
        return levelOrder;
    }

    // BFS solution
    public static List<List<Integer>> levelOrderBottomBFS(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    private static void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;

        if (level >= list.size()) {
            list.add(0, new LinkedList<>());
        }

        levelMaker(list, root.left, level + 1);
        levelMaker(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }

    // DFS solution
    public static List<List<Integer>> levelOrderBottomDFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if (root == null) return wrapList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);

        System.out.println(levelOrderBottom(root));
    }

}
