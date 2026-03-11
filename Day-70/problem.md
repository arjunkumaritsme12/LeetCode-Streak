# Plus One

Link: https://leetcode.com/problems/complement-of-base-10-integer/description/?envType=daily-question&envId=2026-03-11

Approach: 

➡️ Start with a mask value = 1.

➡️ Keep increasing the mask using left shift and +1 until the mask becomes greater than or equal to n.

➡️ This mask creates a number that has all bits as 1 for the length of n in binary.

➡️ Finally, perform XOR (mask ^ n).

➡️ XOR with this mask flips all bits of n, which gives the bitwise complement of the number.