# Plus One

Link: https://leetcode.com/problems/minimum-cost-path-with-teleportations/description/?envType=daily-question&envId=2026-01-28

Approach: 

➡️ Treat each state as (row, col, teleportsUsed)

➡️ Use Dijkstra because costs vary

➡️ Start from (0,0) with cost 0

➡️ Normal move → right / down, add cell value

➡️ Teleport move → cost 0, teleport count +1

➡️ Teleport allowed only to cells with ≤ current value

➡️ Pre-sort all cells by their values

➡️ For each teleport level, expand teleport only once

➡️ Avoid revisiting same cell with same teleport count

➡️ Stop when bottom-right cell is reached