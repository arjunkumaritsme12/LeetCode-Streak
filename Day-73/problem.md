# Plus One

Link: https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/description/?envType=daily-question&envId=2026-03-14

Approach: 

➡️ Use BFS (Queue) to generate all possible happy strings step by step.

➡️ Start the queue with "a", "b", and "c".

➡️ For each string, add only different characters from the last character (a→bc, b→ac, c→ab).

➡️ Keep extending the strings until their length becomes n.

➡️ All valid happy strings will now be in the queue in lexicographical order.

➡️ If the queue size is less than k, return an empty string.

➡️ Otherwise remove k-1 strings from the queue and return the k-th string.