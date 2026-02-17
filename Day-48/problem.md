# Plus One

Link: https://leetcode.com/problems/binary-watch/description/?envType=daily-question&envId=2026-02-17
Approach: 

➡️ Backtracking (DFS) is used
    The solution uses Depth First Search (DFS) to try all possible combinations of LEDs.

➡️ Two separate arrays are used

        hours[] = {1,2,4,8} → Represents 4 LEDs for hours

        minutes[] = {1,2,4,8,16,32} → Represents 6 LEDs for minutes

➡️ Idea of turnedOn
    turnedOn means how many LEDs we still need to switch ON.

➡️ Recursive exploration

        At each step, we decide whether to turn on a particular LED.

        We reduce turnedOn by 1 after choosing one LED.

➡️ Start index (s) is used
    To avoid duplicate combinations, we only move forward in the array.

➡️ Two cases inside loop

        If index < 4 → We are choosing an hour LED

        If index ≥ 4 → We are choosing a minute LED

➡️ Validity check

        Hour must be < 12

        Minute must be < 60
         Invalid combinations are skipped.

➡️ Base condition
    When turnedOn == 0 →
    We create the time string and add it to the answer list.

➡️ Time formatting
    If minutes < 10 → Add leading 0 (example: 3:05 not 3:5)