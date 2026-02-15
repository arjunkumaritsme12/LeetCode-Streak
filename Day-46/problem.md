# Plus One

Link: https://leetcode.com/problems/add-binary/description/?envType=daily-question&envId=2026-02-15

Approach: 

➡️ We use Two Pointer Technique starting from the end of both strings (right to left).

➡️ We maintain a variable called carry (just like normal addition).

➡️ Loop runs while:

        Any string still has digits left OR

        Carry is still 1.

➡️ At each step:

        Add current digit of string a (if available).

        Add current digit of string b (if available).

        Add the previous carry.

➡️ Append (sum % 2) to result (binary remainder).

➡️ Update carry = sum / 2.

➡️ Since we are adding from right to left, finally reverse the StringBuilder.

➡️ Return the final binary result as string.