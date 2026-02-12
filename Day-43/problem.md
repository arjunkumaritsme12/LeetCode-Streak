# Plus One

Link: https://leetcode.com/problems/longest-balanced-substring-i/description/?envType=daily-question&envId=2026-02-12

Approach: 

➡️ Brute Force Method –
        Try every possible substring using two loops (start i, end j).
➡️ Frequency Array (Size 26) –
        For each starting index, maintain a fresh freq[26] array to count characters.

➡️ Expan    d Substring Step-by-Step –
        Keep increasing j and update character frequency.

➡️ Balanced Check Function –
        Call checkBalanced() to verify:
        👉 All non-zero character frequencies must be equal.
 
➡️ Update Maximum Length –
        If substring is balanced, update maxL.

➡️ Final Answer –
        Return the maximum balanced substring length found.