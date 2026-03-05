# Plus One

Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/?envType=daily-question&envId=2026-03-05

Approach: 

➡️ There are two possible patterns for the string:

        "1010..."

        "0101..."

➡️ Traverse the string character by character.

➡️ For pattern "1010..."

        At even index → expected '1'

        At odd index → expected '0'

        If the character is different, increase cost.

➡️ This cost is stored in cost10.

➡️ To convert the string into "0101...", the cost will be length of string - cost10.

➡️ Finally, return the minimum of both costs.