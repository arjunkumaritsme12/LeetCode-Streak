import java.util.*;

class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = Integer.MIN_VALUE;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                int product = nums1[i - 1] * nums2[j - 1];

                int take = Math.max(0, dp[i - 1][j - 1]) + product;
                int skip1 = dp[i - 1][j];
                int skip2 = dp[i][j - 1];

                dp[i][j] = Math.max(take, Math.max(skip1, skip2));
            }
        }

        return dp[m][n];
    }
}
