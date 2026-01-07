# Plus One

Link: https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/?envType=daily-question&envId=2026-01-07

Approach: 

➡️ Traverse the binary tree once to calculate the total sum of all nodes.

➡️ Traverse the tree again using DFS (postorder) to compute the sum of each subtree.

➡️ For every subtree, consider cutting the edge above it and calculate
    subtreeSum × (totalSum − subtreeSum).

➡️ Keep updating the maximum product found.

➡️ Return the maximum product after applying modulo (10⁹ + 7).