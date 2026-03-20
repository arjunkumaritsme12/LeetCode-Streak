# Plus One

Link: https://leetcode.com/problems/minimum-absolute-difference-in-sliding-submatrix/description/?envType=daily-question&envId=2026-03-20

Ap proach: 

➡️ Traverse every possible k × k subgrid in the matrix.

➡️ For each subgrid, collect all elements into a list.

➡️ Sort the list so numbers come in order.

➡️ Check the difference between adjacent elements in the sorted list.

➡️Ignore equal elements, only consider different values.

➡️ Keep track of the minimum difference found.

➡️ If all elements are same, return 0 for that subgrid.

➡️ Store the result in the answer matrix