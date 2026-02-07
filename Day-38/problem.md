# Plus One

Link: https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/?envType=daily-question&envId=2026-02-07

Approach: 

➡️ Traverse the string from left to right

➡️ countB → number of 'b' seen so far

➡️ dp → minimum deletions needed to keep the string balanced

➡️ When 'a' appears:

        Either delete this 'a' (dp + 1)

        Or delete all previous 'b' (countB)

        Take the minimum

➡️ When 'b' appears: increment countB