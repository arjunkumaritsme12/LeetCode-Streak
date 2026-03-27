# Plus One

Link: https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/description/?envType=daily-question&envId=2026-03-27

Approach: 

➡️ We check each row one by one.

➡️ For every element in the row, we compare it with the element at position (j + k) % n.

➡️ (j + k) % n means shifting the row to the right by k positions (circular shift).

➡️ If any element doesn’t match after this shift → return false.

➡️ If all elements match for every row → return true.