# Plus One

Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/?envType=daily-question&envId=2026-01-06

Approach: 

➡️ We use Level Order Traversal (BFS) because it processes the binary tree level by level.

➡️ A queue helps us keep track of nodes at each level.

➡️ For every level:

        Calculate the sum of node values at that level.

        Compare it with the maximum sum found so far.

        If current level sum is greater, update the answer with the current level number.

➡️ Continue this process until all levels are processed.

➡️ Finally, return the smallest level number that has the maximum sum.

👉 This approach works efficiently because each node is visited only once.