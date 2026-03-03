# Plus One

Link: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/?envType=daily-question&envId=2026-03-03

Approach: 

➡️ This problem follows a recursive pattern.

➡️ For every n, string =
        S(n) = S(n-1) + "1" + reverse(invert(S(n-1)))

➡️ Length of string = 2^n - 1.

➡️ Middle element is always '1'.

➡️ If k == middle, return '1'.

➡️ If k < middle, answer lies in left part → call recursion on (n-1, k).

➡️ If k > middle, it lies in right part:

        Convert position using symmetry → newK = 2 * mid - k

        Recursively find answer for (n-1, newK)

        Invert the result (0 → 1, 1 → 0)

➡️ Base case: if n == 1, return '0'.