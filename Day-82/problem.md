# Plus One

Link: https://leetcode.com/problems/maximum-non-negative-product-in-a-matrix/description/?envType=daily-question&envId=2026-03-23

Approach: 

➡️ We move from top-left → bottom-right using only right or down moves.

➡️ At each cell, we store two values:
        dpMax → maximum product till that cell
        dpMin → minimum product till that cell

➡️ Why both?
        👉 Because negative × negative = positive, so minimum can become maximum.

➡️ Initialize first cell with grid value.

➡️ Fill first row and column by simple multiplication (only one path).

➡️ For each cell:
        If current value is negative:
            → swap roles (max comes from previous min, and vice versa)
        If positive:
            → take normal max and min from previous cells
➡️ At the end, check last cell:
        If result is negative → return -1
        Else return max product % (1e9 + 7)