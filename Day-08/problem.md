# Plus One

Link: https://leetcode.com/problems/max-dot-product-of-two-subsequences/description/?envType=daily-question&envId=2026-01-08

Approach: 

➡️ Use Dynamic Programming.

➡️ Let dp[i][j] = max dot product using first i elements of nums1 and first j of nums2.

➡️ At each step:
        Take both elements (start new or extend previous subsequence)
        Skip one element from either array

➡️ To avoid empty subsequence & overflow, use:
        max(0, dp[i-1][j-1]) + nums1[i-1] * nums2[j-1]


➡️ Final answer = dp[m][n].