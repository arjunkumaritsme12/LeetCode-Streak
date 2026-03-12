# Plus One

Link: https://leetcode.com/problems/maximize-spanning-tree-stability-with-upgrades/description/?envType=daily-question&envId=2026-03-12

Approach: 

➡️ Use DSU (Disjoint Set Union) to connect nodes and manage components.

➡️ Apply Binary Search to find the maximum stability value.

➡️ Use a check function to test if stability mid is possible.

➡️ Mandatory edges (m = 1) must be used; if s < mid, return false.

➡️ Optional edges with s ≥ mid are used directly.

➡️ Some edges can be upgraded if 2*s ≥ mid (limited by k).

➡️ Finally check if all nodes are connected.

➡️ The largest valid mid becomes the answer.