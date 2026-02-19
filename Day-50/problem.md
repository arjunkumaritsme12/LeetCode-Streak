# Plus One

Link: https://leetcode.com/problems/count-binary-substrings/description/?envType=daily-question&envId=2026-02-19

Approach: 

✅ We don’t check every substring (that would be slow).

✅ Instead, we count consecutive same characters as a group.

✅ Keep two counters:

        currEquals → count of current group

        prevEquals → count of previous group

✅ Start with:

        currEquals = 1 (first character already counted)

        prevEquals = 0

🔁 Traverse the string:

        If current char = next char → increase currEquals

        If different →

        Add min(prevEquals, currEquals) to answer

        Move current group to previous

        Reset currEquals = 1

🧮 Why min(prev, curr)?

        Because valid substrings depend on the smaller group

        Example: 00011 → groups (3,2) → only 2 valid substrings

✅ After loop ends, add final min(prevEquals, currEquals)