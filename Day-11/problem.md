# Plus One

Link: https://leetcode.com/problems/maximal-rectangle/submissions/1881680894/?envType=daily-question&envId=2026-01-11

Approach: 

➡️ Treat each row as a base. 

➡️ Use a heights[] array to store consecutive 1s vertically.

➡️ If the cell is '1', increase the height.

➡️ If the cell is '0', reset the height to 0.

➡️ Consider each updated row as a histogram.

➡️ Apply the Largest Rectangle in Histogram approach using a stack.

➡️ Update the maximum area at each step.

➡️ The final result is the largest rectangle of 1s.