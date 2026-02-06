# Plus One

Link: https://leetcode.com/problems/minimum-removals-to-balance-array/description/?envType=daily-question&envId=2026-02-06

Approach: 

➡️ Sort the array to work with elements in order

➡️ Fix one element nums[i] as the minimum of a subarray

➡️ Try to find the largest possible end index where
        nums[end] < nums[i] * k

➡️ Use binary search to efficiently find that boundary

➡️ Compute the size of this valid subarray

➡️ Keep track of the maximum valid subarray length

➡️ Minimum removals = total length − max valid subarray length