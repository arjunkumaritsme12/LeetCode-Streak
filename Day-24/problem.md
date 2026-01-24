# Plus One

Link: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=daily-question&envId=2026-01-24
Approach: 

➡️ Sort the array first

        The array is sorted in ascending order.

        This helps in pairing the smallest and largest elements together.

➡️ Use two pointers technique

        One pointer (i) starts from the beginning of the array (smallest element).

        Another pointer (j) starts from the end of the array (largest element).

➡️ Form pairs to minimize the maximum sum

        Pair the smallest number with the largest number.

        This strategy balances the pair sums and avoids very large values.

➡️ Calculate the sum of each pair

        For every pair, calculate nums[i] + nums[j].

➡️ Keep track of the maximum pair sum

        Store the maximum value among all pair sums in the variable ans.

➡️ Move pointers towards the center

        Increment the left pointer (i++)

        Decrement the right pointer (j--)

        Continue until all elements are paired.

➡️ Return the final answer

        The value stored in ans is the minimum possible maximum pair sum.