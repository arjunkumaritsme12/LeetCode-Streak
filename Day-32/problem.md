# Plus One

Link: https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/description/?envType=daily-question&envId=2026-02-01

Approach: 

➡️ Ignore the first element for now.


➡️ Find the smallest and second smallest numbers from the rest of the array.


➡️ Keep updating two variables (min1, min2) while looping.


➡️ Finally, add first element + min1 + min2.


➡️ Return this sum as the minimum cost. ✔️

