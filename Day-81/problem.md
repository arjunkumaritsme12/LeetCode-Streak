# Plus One

Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/?envType=daily-question&envId=2026-03-22
Approach: 

➡️ Try all 4 possible rotations (0°, 90°, 180°, 270°).

➡️ In each step, check if matrix == target using deepEquals.

➡️ If yes → return true immediately.

➡️ If not → rotate the matrix 90° clockwise.

➡️ Rotation is done in 2 steps:
        Reverse rows (top ↔ bottom)
        Transpose (swap i,j with j,i)
        
➡️ After 4 tries, if no match → return false.