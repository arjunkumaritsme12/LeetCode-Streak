# Plus One

Link: https://leetcode.com/problems/equal-sum-grid-partition-ii/description/?envType=daily-question&envId=2026-03-26

Approach: 

➡️ Calculate total sum of grid

➡️ Try splitting grid in all directions (normal, reverse, transpose)

➡️ Keep adding rows → topSum, rest → bottomSum

➡️ If topSum == bottomSum → return true

➡️ Else check if removing one element can balance sums

➡️ Use HashSet for quick lookup