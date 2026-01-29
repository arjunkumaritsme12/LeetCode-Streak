# Plus One

Link: https://leetcode.com/problems/minimum-cost-to-convert-string-i/description/?envType=daily-question&envId=2026-01-29

Approach: 

➡️ Create a 26×26 matrix to store minimum cost to convert one character to another

➡️ Initialize all conversion costs as infinite

➡️ Fill the matrix using given original → changed rules with their costs

➡️ Use Floyd–Warshall to find minimum cost between every character pair

➡️ Traverse source and target character by character

➡️ If characters are same → cost = 0

➡️ Else add minimum conversion cost from matrix

➡️ If conversion is impossible → return -1

➡️ Return total accumulated cost