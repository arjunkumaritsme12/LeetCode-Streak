# Plus One

Link: https://leetcode.com/problems/maximum-matrix-sum/?envType=daily-question&envId=2026-01-05

Approach: 

➡️ Since each operation flips two adjacent elements, the odd/even count of negative numbers never   changes.

➡️ So, we first take the absolute value of every element and keep adding them to get the maximum possible sum.

➡️ While traversing the matrix, we also track:
        the smallest absolute value.
        whether the number of negative elements is odd.

➡️ If negatives are even, all elements can be made positive → this sum is the answer.

➡️ If negatives are odd, one element must remain negative → subtract 2 × smallest absolute value from the sum.