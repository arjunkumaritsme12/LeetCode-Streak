# Plus One

Link: https://leetcode.com/problems/minimum-number-of-seconds-to-make-mountain-height-zero/description/?envType=daily-question&envId=2026-03-13

Approach: 

➡️ Use Binary Search on time to find the minimum seconds needed.

➡️ For a given time m, calculate how much mountain height all workers can reduce.

➡️ Each worker reduces height in a pattern w × (1 + 2 + ... + x) which is an increasing time sequence.

➡️ Using the formula, compute the maximum height x a worker can reduce in m seconds.

➡️ Add the reduced height from all workers.

➡️ If total reduced height < mountainHeight, increase time.

➡️ Otherwise decrease time to find the minimum possible seconds.

➡️ Finally return the smallest time where the mountain can be completely reduced.