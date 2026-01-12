# Plus One

Link: https://leetcode.com/problems/minimum-time-visiting-all-points/description/?envType=daily-question&envId=2026-01-12

Approach: 

➡️ Traverse the points one by one in order

➡️ For each consecutive pair of points:

       Calculate horizontal distance dx = |x2 − x1|.

       Calculate vertical distance dy = |y2 − y1|.

➡️ Use diagonal moves as much as possible (they cover both x and y in 1 second).

➡️ Remaining distance is covered by straight moves.

➡️ Minimum time needed = max(dx, dy).

➡️ Add this time for all point transitions.

➡️ Return the total time.