# Plus One

Link: https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/?envType=daily-question&envId=2026-01-10

Approach: 

➡️ Use Dynamic Programming.

➡️ dp[i][j] = minimum ASCII delete sum to make s1[i…] and s2[j…] equal.

➡️ If characters match → move both pointers, no cost added.

➡️ If they don’t match → delete from either string and take the minimum cost.

➡️ Base case: if one string ends, delete all remaining characters of the other.

➡️ Fill DP table from end to start.

➡️ Final answer is dp[0][0].