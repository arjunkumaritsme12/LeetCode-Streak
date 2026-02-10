# Plus One

Link: https://leetcode.com/problems/longest-balanced-subarray-i/description/?envType=daily-question&envId=2026-02-10

Approach: 

➡️ We try all possible subarrays using two loops.

➡️ For every starting index, we expand the subarray step by step.

➡️ We use a set to track unique numbers only.

➡️For every new number:

        Check if it is even or odd.

        Increase the count of even or odd accordingly.

➡️ If even count == odd count, the subarray is balanced.

➡️ Update the maximum length found so far.

➡️ Finally, return the longest balanced subarray length.