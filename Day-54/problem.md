# Plus One

Link: https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/description/?envType=daily-question&envId=2026-02-23

Approach: 

✅ Total Possible Codes

        There are 2^k possible binary codes of length k.

✅ Early Check

        If string length < 2^k, then it's impossible → return false.

✅ Boolean Array

        Create a boolean[] used of size 2^k

        This keeps track of which binary codes are found.

✅ Sliding Window Technique

        Use a window of size k to check every substring.

✅ Bit Manipulation

        Convert substring into integer using binary shifting.

        Left shift the previous window.

        Add new bit.

        Remove extra bit using mask (window &= n - 1).

✅ Mark Found Codes

        Mark used[window] = true for each substring.

✅ Final Check

        If all values in used[] are true, return true.

        Otherwise return false.