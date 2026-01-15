# Plus One

Link: https://leetcode.com/problems/maximize-area-of-square-hole-in-grid/description/?envType=daily-question&envId=2026-01-15

Approach: 

➡️ Remove continuous bars to create bigger empty spaces.

➡️ Sort hBars and vBars.

➡️ Find the longest consecutive sequence in each.

➡️ Continuous k bars → gap size = k + 1.

➡️ Square side = min(horizontalGap, verticalGap).

➡️ Return area = side × side.