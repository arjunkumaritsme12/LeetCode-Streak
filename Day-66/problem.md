# Plus One

Link: https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/description/?envType=daily-question&envId=2026-03-07

Approach: 

➡️ Count how many 0s and 1s are present at even and odd positions in the string.

➡️ Check flips needed to make pattern "0101…" and "1010…".

➡️ Take the minimum flips from these two patterns.

➡️ Rotate the string step by step and update counts of even and odd positions.

➡️ After every rotation, recalculate flips for both patterns.

➡️ Keep updating the minimum flips answer.