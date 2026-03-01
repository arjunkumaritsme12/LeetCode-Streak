# Plus One

Link: https://leetcode.com/problems/minimum-operations-to-equalize-binary-string/description/?envType=daily-question&envId=2026-02-27

Approach: 

➡️ Each deci-binary number can only contain digits 0 or 1.

➡️ So in one deci-binary number, we can contribute maximum 1 to each digit position.

➡️ If any digit in n is 5, it means:

        We need at least 5 deci-binary numbers

        Because to make 5 at that position, we must add five 1’s.

➡️ So the answer depends on the largest digit in the string.

➡️ Find the maximum digit in n.

➡️ Return that maximum digit as the result.