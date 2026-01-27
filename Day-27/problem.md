# Plus One

Link: https://leetcode.com/problems/minimum-cost-path-with-edge-reversals/description/?envType=daily-question&envId=2026-01-27

Approach: 

➡️ For every edge u → v (w), keep it as it is

➡️ Also add a reverse edge v → u with cost 2w

➡️ This automatically handles the switch rule

➡️ Now all edge costs are positive

➡️ Run Dijkstra from node 0

➡️ The minimum distance to node n-1 is the answer

➡️ If n-1 is unreachable, return -1