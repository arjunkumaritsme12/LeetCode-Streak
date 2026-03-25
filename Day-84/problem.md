# Plus One

Link: https://leetcode.com/problems/equal-sum-grid-partition-i/description/?envType=daily-question&envId=2026-03-25

Approach: 

➡️ First, calculate the total sum of all elements in the grid.

➡️ Try to split the grid row-wise: keep adding row sums and check if at any point it becomes half of total sum.

➡️ If not possible, transpose the grid (convert rows → columns).

➡️ Repeat the same check again (this time it acts like column-wise split).

➡️ If any split gives equal halves → return true, otherwise false.