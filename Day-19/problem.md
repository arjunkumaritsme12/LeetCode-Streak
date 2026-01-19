# Plus One

Link: https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/description/?envType=daily-question&envId=2026-01-19

Approach: 

➡️ Create a prefix sum matrix so any square sum can be found quickly.

➡️ Use binary search on the square side length (0 → min(rows, cols)).

➡️ For a chosen side length, check all possible squares using prefix sums.

➡️ If any square sum is ≤ threshold, try a bigger size.

➡️ If not, try a smaller size.

➡️ The largest valid size found is the answer.