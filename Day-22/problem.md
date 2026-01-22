# Plus One

Link: https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/description/?envType=daily-question&envId=2026-01-22

Approach: 

➡️ Convert the array into a list for easy removal and replacement.

➡️ Check if the array is already non-decreasing → return 0.

➡️ While the array is not non-decreasing:

        Scan all adjacent pairs.

        Find the leftmost pair with minimum sum.

        Replace that pair with their sum.

        Increment operation count.

➡️ Return the total number of operations.