# Plus One

Link: https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/description/?envType=daily-question&envId=2026-03-19

Approach: 

➡️ We use prefix sum technique to count how many 'X' and 'Y' are present from (0,0) to any cell (i,j).

➡️ Create two 2D arrays:

        x[][] → stores count of 'X'

        y[][] → stores count of 'Y'

➡️ For every cell, update counts using previous values (top + left − overlap).

➡️ At each cell (i,j), check:

        If number of 'X' > 0

        And number of 'X' == number of 'Y'

➡️ If both conditions are true → increase answer.

➡️ Finally return total count.