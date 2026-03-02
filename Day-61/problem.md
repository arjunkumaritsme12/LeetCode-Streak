# Plus One

Link: https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/description/?envType=daily-question&envId=2026-03-02

Approach: 

➡️ Understand the Condition

        For a grid to be valid, all cells above main diagonal must be 0.

        That means:

            Row 0 needs n-1 trailing zeros.

            Row 1 needs n-2 trailing zeros.

            Row i needs n-1-i trailing zeros.

➡️ Count Trailing Zeros for Each Row

        For every row, count how many zeros appear at the end (right side).

        Store these counts in an array suffixZeros.

➡️ Greedy Row Fixing

        Start from row 0 to row n-1.

        For each row i:

            Calculate how many zeros are needed → needed = n-1-i.

➡️ Find a Suitable Row

        From current position i downward, find the first row that has suffixZeros >= needed.

➡️ If No Such Row Found

        Return -1 because it is impossible to make grid valid.

➡️ Bring That Row Up

        Swap it upward (like bubble sort).

        Number of swaps = j - i.

        Add this to answer.

➡️ Shift Rows Properly

        Move the found row to position i.

        Shift other rows down accordingly.

➡️ Repeat Until All Rows Fixed

➡️ Return Total Swaps