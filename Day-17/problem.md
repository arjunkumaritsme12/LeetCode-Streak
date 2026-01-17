# Plus One

Link: https://leetcode.com/problems/find-the-largest-area-of-square-inside-two-rectangles/description/?envType=daily-question&envId=2026-01-17

Approach: 

➡️ Take every pair of rectangles (because square must be inside an intersection).

➡️ Find overlap width = min(x2) − max(x1).

➡️ Find overlap height = min(y2) − max(y1).

➡️ If both overlaps are positive, intersection exists.

➡️ Square side = min(overlap width, overlap height).

➡️ Track maximum side from all pairs.

➡️ Return area = side × side (return 0 if no intersection).