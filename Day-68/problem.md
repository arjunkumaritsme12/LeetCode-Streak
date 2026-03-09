# Plus One

Link: https://leetcode.com/problems/find-all-possible-stable-binary-arrays-i/description/?envType=daily-question&envId=2026-03-09

Approach: 

➡️ Use 3D Dynamic Programming to count possible stable arrays.

➡️ dp[i][j][k] stores number of arrays with i zeros, j ones, and last element = k (0 or 1).

➡️ Initialize base cases when array contains only zeros or only ones within the allowed limit.

➡️ Build the DP table by adding 0 or 1 to previous valid arrays.

➡️ Ensure that more than limit same numbers are not placed consecutively by subtracting invalid cases.

➡️ Use modulo (1e9 + 7) to avoid large numbers.

➡️ Final answer = arrays ending with 0 + arrays ending with 1.