# Plus One

Link: https://leetcode.com/problems/get-biggest-three-rhombus-sums-in-a-grid/description/?envType=daily-question&envId=2026-03-16

Approach: 

➡️ Traverse every cell of the grid as the top point of a rhombus.

➡️ For each cell, try different rhombus sizes (sz) while it stays inside the grid.

➡️ If sz = 0, the rhombus is just one cell, so take that value.

➡️ If sz > 0, calculate the border sum of the rhombus using getSum().

➡️ In getSum(), move along the four edges of the rhombus (down-left, down-right, up-right, up-left) and add values.

➡️ Store each sum in a TreeSet to keep values sorted and unique.

➡️ If more than 3 sums are stored, remove the smallest one.

➡️ At the end, return the three largest rhombus sums in descending order.