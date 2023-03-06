package AllAroundPractice;

import java.util.Stack;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static int[] numberOfLeafsByLevel(TreeNode bt) {
        if (bt == null) return null;
        int[] ans = new int[height(bt)];
        numberOfLeafsByLevelHelper(bt, ans, 0);
        return ans;
    }

    private static void numberOfLeafsByLevelHelper(TreeNode bt, int[] ans, int i) {
        if (bt == null) return;
        if (bt.left == null && bt.right == null) {
            ans[i]++;
        }
        numberOfLeafsByLevelHelper(bt.left, ans, i + 1);
        numberOfLeafsByLevelHelper(bt.right, ans, i + 1);
    }

    private static int height(TreeNode bt) {
        if (bt == null) return -1;
        return 1 + Math.max(height(bt.left), height(bt.right));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        Stack<TreeNode> node_stack = new Stack<>();
        Stack<Integer> sum_stack = new Stack<>();

        node_stack.add(root);
        sum_stack.add(targetSum - root.val);

        while (!node_stack.isEmpty()) {
            TreeNode current_node = node_stack.pop();
            int current_sum = sum_stack.pop();

            if (current_node.left == null && current_node.right == null && current_sum == 0) {
                return true;
            }

            if (current_node.left != null) {
                node_stack.add(current_node.left);
                sum_stack.add(current_sum - current_node.left.val);

            }
            if (current_node.right != null) {
                node_stack.add(current_node.right);
                sum_stack.add(current_sum - current_node.right.val);
            }
        }
        return false;
    }






        public static void main (String[]args){

        }


}
