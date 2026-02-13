# Plus One

Link: https://leetcode.com/problems/longest-balanced-substring-ii/description/?envType=daily-question&envId=2026-02-13

Approach: 

➡️ Use Prefix Sum to count a, b, c.

➡️ Use HashMap to store first occurrence of difference.

➡️ If same difference appears again → substring is balanced.

➡️ Check 3 cases:

        One letter continuous

        Two letters equal

        Three letters equal