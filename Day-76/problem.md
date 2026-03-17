# Plus One

Link: https://leetcode.com/problems/largest-submatrix-with-rearrangements/description/?envType=daily-question&envId=2026-03-17

Approach: 

➡️ Convert each row into a histogram (count consecutive 1’s column-wise).

➡️ For every row, update heights:
        → if current cell is 1 → increase height
        → if 0 → reset to 0

➡️ Copy and sort the histogram (so we can rearrange columns).

➡️ After sorting:
        → treat each value as height
        → width = remaining columns (n - i)

➡️ Calculate area = height × width for each position.

➡️ Keep updating the maximum area.

➡️ Return the final maximum submatrix area.