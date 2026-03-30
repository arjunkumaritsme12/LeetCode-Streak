# Plus One

Link: https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/description/?envType=daily-question&envId=2026-03-30

Approach: 

➡️ We separate characters based on even index and odd index.

➡️ We count how many times each character appears at even and odd positions in both strings.

➡️ For s1, we add counts, and for s2, we subtract counts.

➡️ If both strings are valid, all counts should become zero.

➡️ If any count is not zero, it means mismatch → return false.

➡️ Otherwise → return true.