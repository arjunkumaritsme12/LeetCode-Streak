# Plus One

Link: https://leetcode.com/problems/binary-number-with-alternating-bits/description/?envType=daily-question&envId=2026-02-18

Approach: 

➡️ 1️⃣ Convert number into binary form (mentally).
➡️ 2️⃣ Shift number 2 bits right → n >> 2
➡️ 3️⃣ Take XOR of both → a = n ^ (n >> 2)
➡️ 4️⃣ If bits were alternating → a will have only one 1 (power of 2).
➡️ 5️⃣ Check using trick → (a & (a - 1)) == 0
➡️ 6️⃣ If true → alternating bits ✔
➡️ 7️⃣ If false → not alternating ❌