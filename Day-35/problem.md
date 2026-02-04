# Plus One

Link: https://leetcode.com/problems/trionic-array-ii/description/?envType=daily-question&envId=2026-02-04

Approach: 

➡️ Uses Dynamic Programming (DP)

➡️ Uses Memoization to avoid recomputation

➡️ State defined by index (i) and trend

➡️ Trend meanings:

        0 → not started

        1 → increasing

        2 → decreasing

        3 → increasing again

➡️ Recursion explores take or skip choices

➡️ Skip allowed only before start

➡️ Sequence must follow ↑ ↓ ↑ pattern

➡️ Sum is added only when element is taken

➡️ Invalid paths return negative infinity

➡️ Base case validates complete trionic sequence

➡️ Final answer starts from index 0, trend 0