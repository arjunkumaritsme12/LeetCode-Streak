# Plus One

Link: https://leetcode.com/problems/largest-magic-square/description/?envType=daily-question&envId=2026-01-18

Approach: 

➡️ Every 1×1 cell is a magic square → start answer = 1

➡️ Build prefix sums for:

        Rows

        Columns

        Main diagonal

        Anti-diagonal

➡️ Try all square sizes k from 2 to min(m, n)

➡️ For each k × k square:

        Fix the target sum using first row

➡️ Check:

        All row sums == target

        All column sums == target

        Both diagonal sums == target

➡️ Use prefix sums to calculate each sum in O(1)

➡️ If all checks pass → update answer = k

➡️ Return the largest valid k.