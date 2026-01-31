# Plus One

Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=daily-question&envId=2026-01-31

Approach: 

➡️ Letters array is sorted

➡️ Goal: find smallest letter > target

➡️ Use Binary Search

➡️ Set l = 0, r = n

➡️ Find middle m

➡️ If letters[m] > target → move left (r = m)

➡️ Else → move right (l = m + 1)

➡️ Loop until l == r

➡️ Use l % n to handle wrap-around

➡️ Return the result ✅