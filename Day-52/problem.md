# Plus One

Link: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/?envType=daily-question&envId=2026-02-21

Approach: 

✅ We need to check numbers from left to right.

✅ For each number, count how many set bits (1s) are present in its binary form.
        👉 Use Integer.bitCount(num).

✅ Check if this count is a prime number.

✅ Instead of checking prime every time, we use a magic number (665772).

        This number stores prime positions (2, 3, 5, 7, 11, 13, 17, 19) as 1 in binary form.

        It helps us check prime in O(1) time using bit operation.

✅ Shift the magic number right by bitCount and check last bit:

        (magic >> bitCount) & 1

        If result is 1 → bit count is prime.

        Increase answer.

✅ Return the final count.