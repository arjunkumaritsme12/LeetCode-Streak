# Plus One

Link: https://leetcode.com/problems/minimum-pair-removal-to-sort-array-ii/description/?envType=daily-question&envId=2026-01-23

Approach: 

➡️ Represent array as a doubly linked list (Node = value + index).

➡️ Store all adjacent pairs in a min-heap (PriorityQueue) by pair sum.

➡️ Track how many times array is decreasing (decreaseCount).

➡️ While array is not non-decreasing:

        Pick minimum-sum adjacent pair (leftmost if tie).

        Validate pair (not already merged, sum unchanged).

        Merge the pair into one node.

        Update decreaseCount with neighbors.

        Push new adjacent pairs into heap.

        Increment operation count.

➡️ Stop when decreaseCount == 0.

➡️ Return total operations.