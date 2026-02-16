# Plus One

Link: https://leetcode.com/problems/reverse-bits/description/?envType=daily-question&envId=2026-02-16

Approach: 

➡️ Take an integer n.

➡️ Create a variable ans = 0 to store the reversed result.

➡️ Loop from i = 0 to 31 (because integer has 32 bits).

➡️ For each bit position i:

        Right shift n by i → (n >> i)

        Check last bit using & 1

➡️ If that bit is 1:

        Set the bit at position (31 - i) in ans

➡️ Repeat for all 32 bits.

➡️ Return ans.