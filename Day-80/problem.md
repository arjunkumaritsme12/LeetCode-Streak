# Plus One

Link: https://leetcode.com/problems/flip-square-submatrix-vertically/description/?envType=daily-question&envId=2026-03-21

Approach: 

➡️ We are given a matrix (grid) and we want to reverse a k × k submatrix starting from position (x, y).

➡️ The idea is to flip the submatrix vertically (top rows with bottom rows).

➡️ We run a loop from the top row to the middle row of the submatrix.
       
➡️ For each row i, we find its opposite row i2 from the bottom:
        i2 = x + k - 1 - (i - x)

➡️ Then for every column j in that submatrix:
        We swap elements of row i and row i2.

➡️ This swapping continues until we reach the middle → so the whole submatrix gets reversed vertically.

➡️ Finally, we return the updated grid.