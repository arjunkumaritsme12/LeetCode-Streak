# Plus One

Link: https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/description/?envType=daily-question&envId=2026-01-21

Approach: 

➡️ Convert the number idea into binary thinking

➡️ Focus on the last continuous group of 1s in the binary form

➡️ Find the highest 1 bit inside that last group

➡️ Subtract that value from the original number to get the minimum valid result

➡️ Special case:

        If number is 2, answer is -1 (no valid smaller value)

➡️ Helper logic (core trick):

        Start from bit 1

        Keep shifting left while the bit exists in the number

        Stop when the bit is 0 → go one step back

        That gives the leading 1 of the last 1s group