# Plus One

Link: https://leetcode.com/problems/special-binary-string/description/?envType=daily-question&envId=2026-02-20

Approach: 

✅ 🔹 A special string has equal number of 1s and 0s, and in every prefix, 1s ≥ 0s.

✅ 🔹 Traverse the string using a count variable (+1 for 1, -1 for 0).

✅ 🔹 When count == 0, a valid special substring is found.

✅ 🔹 Apply recursion on the inner substring.

✅ 🔹 Store each as "1" + recursive_result + "0".

✅ 🔹 Sort all special substrings in reverse lexicographical order.

✅ 🔹 Join them together to get the final largest special string. 🚀