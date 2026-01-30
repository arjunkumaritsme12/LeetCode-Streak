# Plus One

Link: https://leetcode.com/problems/minimum-cost-to-convert-string-ii/description/?envType=daily-question&envId=2026-01-30

Approach: 

➡️ Substrings as nodes
        Treat each unique original and changed substring as a node.

➡️ Graph creation
        A directed weighted graph is built where
        original → changed with given cost.

➡️ Floyd–Warshall
        Used to find minimum conversion cost between every pair of substrings.

➡️ Substring lengths optimization
        Only allowed substring lengths are checked (from original[]).

➡️ Dynamic Programming (DP)
        dp[i] = minimum cost to convert source[0…i) to target[0…i).

➡️ Character match case
        If source[i] == target[i], move ahead with zero cost.

➡️ Substring replacement case
        Try all valid substrings starting at index i and update DP using precomputed shortest cost.

➡️ Final decision
        If dp[n] is unreachable → return -1, else return minimum cost.