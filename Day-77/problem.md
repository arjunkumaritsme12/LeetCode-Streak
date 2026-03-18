# Plus One

Link: https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/description/?envType=daily-question&envId=2026-03-18

Approach: 

➡️ We use Prefix Sum (2D) to store sum of submatrices.

➡️ Create a prefix matrix where each cell stores sum from (0,0) to (i,j).

➡️ Formula used:
        prefix[i][j] = current + top + left - diagonal

➡️ While filling prefix matrix:

        Calculate sum of submatrix from top-left (0,0) to current (i,j).

        Check if this sum is ≤ k.

➡️ If yes → increase count (ans++).

➡️ Finally return total count.