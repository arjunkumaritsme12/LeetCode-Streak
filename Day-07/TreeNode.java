import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
}

class Solution {
    long max = 0;
    long total;
    final int MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        total = sum(root);
        dfs(root);
        return (int)(max % MOD);
    }

    long sum(TreeNode node) {
        if (node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }

    long dfs(TreeNode node) {
        if (node == null) return 0;
        long s = node.val + dfs(node.left) + dfs(node.right);
        max = Math.max(max, s * (total - s));
        return s;
    }
}
