# Plus One

Link: https://leetcode.com/problems/find-unique-binary-string/description/?envType=daily-question&envId=2026-03-08

Approach: 

➡️ First, convert all given binary strings into numbers.

➡️ Store these numbers in a Set so we can check them quickly.

➡️ Calculate the maximum possible numbers using the length of the binary string.

➡️ Start checking numbers from 0 to max range.

➡️ If a number is not present in the Set, it means this binary string is different from all given    strings.

➡️ Convert that number back to a binary string and return it.