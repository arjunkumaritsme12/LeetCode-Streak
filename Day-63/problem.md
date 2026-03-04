# Plus One

Link: https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/?envType=daily-question&envId=2026-03-04

Approach: 

➡️ Count how many 1s are in each row.

➡️ Count how many 1s are in each column.

➡️ Traverse the matrix again.

➡️ If a cell has 1 and its row count = 1 and column count = 1, it is a special position.

➡️ Increase the answer count.