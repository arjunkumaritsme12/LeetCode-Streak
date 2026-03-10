# Plus One

Link: https://leetcode.com/problems/find-all-possible-stable-binary-arrays-ii/description/?envType=daily-question&envId=2026-03-10

Approach: 

➡️ We use Dynamic Programming (DP) to count all possible stable binary arrays.

➡️ Create a 3D DP array dp[i][j][k]

        i → number of 0s used

        j → number of 1s used

        k → last element of the array (0 or 1)

➡️ Initialize base cases:

        If we only place 0s, we can place at most limit continuous 0s.

        If we only place 1s, we can place at most limit continuous 1s.

➡️ For each (i, j) pair:

        To end with 0, we add results from previous states and ensure we do not exceed limit consecutive 0s.

        To end with 1, we do the same while checking the limit for 1s.

➡️ While calculating, we subtract invalid cases where consecutive numbers exceed the allowed limit.

➡️ Use modulo 10^9 + 7 to keep numbers within range.

➡️ The final answer is the sum of arrays ending with 0 and arrays ending with 1.