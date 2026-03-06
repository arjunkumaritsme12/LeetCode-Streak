# Plus One

Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/?envType=daily-question&envId=2026-03-06

Approach: 

➡️ Check if the string contains the pattern "01".

➡️ If "01" exists → the 1s are not in a single continuous segment → return false.

➡️ If "01" does not exist → all 1s are in one segment → return true.