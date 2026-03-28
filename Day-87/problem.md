# Plus One

Link: https://leetcode.com/problems/find-the-string-with-lcp/description/?envType=daily-question&envId=2026-03-28

Approach: 

➡️ Fill string with placeholders.

➡️ Assign same letter where lcp[i][j] > 0.

➡️ Use new letters (a, b, c...) when needed.

➡️ If letters exceed 'z' → return "".

➡️ Verify LCP matrix matches the string.

➡️ Return final string.