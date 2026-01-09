# Plus One

Link: https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/description/?envType=daily-question&envId=2026-01-09

Approach: 

➡️ Use DFS (post-order traversal).

➡️ For every node, compute:

        deepest depth in its subtree.

        node that contains all deepest nodes.

➡️ If left depth == right depth → current node is the answer.

➡️ If one side is deeper → move to that deeper side.


➡️ Return result bottom-up.
➡️ Final node returned is the smallest subtree containing all deepest nodes.