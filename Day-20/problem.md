# Plus One

Link: https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/description/?envType=daily-question&envId=2026-01-20

Approach: 

➡️ We process the array element by element.

➡️ For each number:

        If the number is 2, we directly return -1 (special case).

        Otherwise, we analyze its binary form.

➡️ We find the last continuous group of 1s from the right side.

➡️ From that group, we take the leading (leftmost) 1.

➡️ That value is subtracted from the original number.

➡️ The result is stored in the answer array.

➡️ Bitwise AND (&) and left shift (<<) are used to efficiently detect consecutive 1s.