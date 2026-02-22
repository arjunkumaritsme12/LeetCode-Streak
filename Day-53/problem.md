# Plus One

Link: https://leetcode.com/problems/binary-gap/description/?envType=daily-question&envId=2026-02-22

Approach: 

✅ Convert the number into binary form (done using n /= 2 inside loop).

✅ Traverse each bit of the number from right to left.

✅ Use a variable d to count distance between two 1s.

        Start d from a negative value so first 1 does not affect answer.

✅ If current bit is 1:

        Update answer using Math.max(ans, d).

        Reset distance d = 0.

✅ If current bit is 0:

        Just increase distance d++.

✅ Continue until number becomes 0.

✅ Return the maximum distance found.