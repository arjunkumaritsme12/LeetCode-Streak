class Solution {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return solve(root).node;
    }

    private Result solve(TreeNode root) {
        if (root == null) return new Result(null, 0);

        Result left = solve(root.left);
        Result right = solve(root.right);

        if (left.depth == right.depth) return new Result(root, left.depth + 1);
        if (left.depth > right.depth) return new Result(left.node, left.depth + 1);

        return new Result(right.node, right.depth + 1);
    }

    private static class Result {
        TreeNode node;
        int depth;

        Result(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
