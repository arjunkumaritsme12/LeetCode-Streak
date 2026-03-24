# Plus One

Link: https://leetcode.com/problems/construct-product-matrix/description/?envType=daily-question&envId=2026-03-24

Approach: 

➡️ Convert grid into linear order (row-wise)

➡️ Build prefix product (left side product)

➡️ Traverse backward with suffix product (right side product)

➡️ For each cell → prefix × suffix

➡️ Use mod (12345) to control large values