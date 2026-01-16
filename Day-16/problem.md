# Plus One

Link: https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field/?envType=daily-question&envId=2026-01-16

Approach: 

➡️ Add boundary fences (1 and m / n) because they can’t be removed

➡️ Sort horizontal and vertical fence positions

➡️ Find all possible distances (gaps) between two horizontal fences

➡️ Find all possible distances (gaps) between two vertical fences

➡️ A square is possible only when same distance exists in both

➡️ Pick the maximum common distance

➡️ Answer = (distance × distance) % (10⁹ + 7)

➡️ If no common distance → return -1