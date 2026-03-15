# Plus One

Link: https://leetcode.com/problems/fancy-sequence/description/?envType=daily-question&envId=2026-03-15

Approach: 

➡️ Lazy Update – Do not update all elements; keep global variables a and b.

➡️ Formula Use – Each value is treated as a * val + b.

➡️ Append Handling – Store value after reversing the transformation.

➡️ Modular Arithmetic – Use modulo 1e9 + 7 for all operations.

➡️ Modular Inverse – Use Fermat’s theorem a^(MOD−2) for division.

➡️ addAll – Update b = b + inc.

➡️ multAll – Update a = a * m and b = b * m.

➡️ getIndex – Return (a * storedVal + b) % MOD.