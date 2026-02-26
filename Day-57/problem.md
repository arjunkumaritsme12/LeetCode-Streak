# Plus One

Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/description/?envType=daily-question&envId=2026-02-26

Approach: 

✅ We treat the given binary string like a number.

✅ If the last digit is 0, it means the number is even → just divide by 2 (remove last 0).

✅ Keep removing all trailing 0s and count each removal as 1 step.

✅ If the string becomes "1", stop and return the steps.

✅ If the number is odd (ends with 1), we need to add 1 (1 step).

✅ After adding 1, all 1s become 0s and some carry happens.

✅ For every:

        1 → it takes 1 step

        0 → it takes 2 steps (add 1 + divide)

✅ Add all these steps to the answer.