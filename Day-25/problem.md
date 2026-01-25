# Plus One

Link: https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=daily-question&envId=2026-01-25

Approach: 

➡️ First, sort the array so numbers come in order.

➡️ We want k numbers whose difference (max − min) is minimum.

➡️ After sorting, any best group of k numbers will be continuous.

➡️ Take the first k elements and find their difference → store it as answer.

➡️ Now slide a window of size k across the array.

➡️ For each window, calculate last element − first element.

➡️ Keep updating the minimum difference.

➡️ Finally, return the smallest difference found. ✅