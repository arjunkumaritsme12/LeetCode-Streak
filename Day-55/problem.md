# Plus One

Link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/?envType=daily-question&envId=2026-02-24

Approach: 

✅ Use Depth First Search (DFS) to traverse the tree.

✅ Keep a variable val to store the current binary number.

✅ At each node:

        Multiply previous value by 2

        Add current node value (0 or 1)

✅ This builds the binary number from root to current node.

✅ If the node is a leaf node:

        Add the formed number to ans.

✅ Recursively call DFS for:

        Left subtree

        Right subtree

✅ Finally, return the total sum ans.