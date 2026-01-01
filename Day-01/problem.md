# Plus One

Link: https://leetcode.com/problems/plus-one/

Approach: 
We start from the last digit and add 1 to it, just like normal addition.
If the digit becomes 10, we set it to 0 and move left to handle the carry.
This process continues until there is no carry left.
If all digits were 9, we create a new array with 1 at the start and zeros after it.