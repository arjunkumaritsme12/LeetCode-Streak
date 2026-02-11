# Plus One

Link: https://leetcode.com/problems/longest-balanced-subarray-ii/description/?envType=daily-question&envId=2026-02-11

Approach: 

➡️ Convert even → +1, odd → -1.

➡️ Balanced subarray ⇒ cumulative sum becomes 0.

➡️ Use Segment Tree + Lazy Propagation for fast range updates.

➡️ Store min and max in each segment to detect if 0 exists.

➡️ On each index r:

        Update prefix range [0..r] with +1 or -1.

        If duplicate element appears, undo its previous effect.

➡️ Find leftmost index where prefix sum is 0.

➡️ Update max length = r - l + 1.