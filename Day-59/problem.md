# Plus One

Link: https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/description/?envType=daily-question&envId=2026-02-28

Approach: 

1️⃣ Start with ans = 0.

1️⃣ Loop from 1 to n.

1️⃣ For every number i:

        Find how many bits are needed to represent i in binary.

        Left shift ans by that many bits (to make space).

        Add i to ans.

1️⃣ Take modulo 1_000_000_007 at every step to avoid overflow.

1️⃣ After the loop ends, return ans