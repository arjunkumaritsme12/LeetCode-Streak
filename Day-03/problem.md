# Plus One

Link: https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/?envType=daily-question&envId=2026-01-03

Approach: 

For each row, there are only two possible patterns:
(1) the first and third cells have the same color,
(2) all three cells have different colors.

For the first row, both patterns have 6 possible ways.

For every next row, we calculate new combinations based on the previous row,
making sure that adjacent cells do not have the same color.

At each step, we update the count and apply modulo to avoid overflow.

Finally, we add both pattern counts to get the total number of ways.