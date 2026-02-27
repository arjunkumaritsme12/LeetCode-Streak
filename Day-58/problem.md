# Plus One

Link: https://leetcode.com/problems/minimum-operations-to-equalize-binary-string/description/?envType=daily-question&envId=2026-02-27

Approach: 

1️⃣ Count total number of '0' in string → call it m.
2️⃣ Goal is to make m = 0.

3️⃣ Treat each zero count as a state (node).
4️⃣ Use BFS to find minimum operations.

5️⃣ From current m, compute possible new zero counts using:
        👉 newZeros = m + k - 2 × (zeros flipped)

6️⃣ Find all valid newZeros inside allowed range.

7️⃣ Mark visited states to avoid repeating.

8️⃣ If we reach 0 → return steps.
9️⃣ If not reachable → return -1.