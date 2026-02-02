# Plus One

Link: https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-ii/description/?envType=daily-question&envId=2026-02-02

Approach: 

➡️ We always include nums[0] in the answer.

➡️ From the rest, we need the smallest (k − 1) numbers within a window of size dist.

➡️ Use sliding window to move through the array.

➡️ Maintain two multisets:

        selected → stores the smallest (k − 1) numbers.

        candidates → stores remaining numbers.

➡️ Keep the sum of elements in selected as windowSum.

➡️ When window moves:

        Remove the element going out.

        Add the new incoming element.

➡️ Rebalance sets so selected always has exactly (k − 1) elements.

➡️ Track the minimum windowSum.

➡️ Final answer = nums[0] + minimum windowSum.