# Plus One

Link: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/?envType=daily-question&envId=2026-02-25

Approach: 

✅ Convert the array into a Stream.

✅ Change int to Integer (because sorting with Comparator needs objects).

✅ Sort numbers based on:

        First → Number of 1s in binary (Integer.bitCount()).

        Second → Normal numeric value (if bit counts are same).

✅ Convert back from Integer to int.

✅ Return the sorted array.