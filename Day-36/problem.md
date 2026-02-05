# Plus One

Link: https://leetcode.com/problems/transformed-array/description/?envType=daily-question&envId=2026-02-05

Approach: 

➡️ Array is circular, so index wrap-around is allowed

➡️ Loop through each index i

➡️ Movement depends on value at nums[i]

➡️ Use modulo (%) to handle circular movement

➡️ Calculate new index using:

        (i + nums[i] % n + n) % n
➡️ This formula:

        Moves right for positive values

        Moves left for negative values

        Prevents negative index

➡️ Pick value from the calculated index

➡️ Store it in result array at position i