# Plus One

Link: https://leetcode.com/problems/champagne-tower/description/?envType=daily-question&envId=2026-02-14

Approach: 

➡️ Use a 2D Array (DP Table)

        We create a 2D array dp[row][glass].

        dp[i][j] represents how much champagne is in the jth glass of ith row.

➡️ Initialize the Top Glass

        Put the entire poured value in dp[0][0].

➡️ Traverse Row by Row

        Start from row 0 up to query_row - 1.

        For each glass:

            If it contains more than 1, it will overflow.

➡️ Handle Overflow

        If dp[i][j] > 1:

            Extra = dp[i][j] - 1

            Divide extra equally:

                Left child → dp[i+1][j] += extra / 2

                Right child → dp[i+1][j+1] += extra / 2

➡️ Continue Until Target Row

        Keep passing overflow downward until we reach the required row.

➡️ Return Final Answer

        A glass can hold maximum 1.

        So we return:

            Math.min(1.0, dp[query_row][query_glass])