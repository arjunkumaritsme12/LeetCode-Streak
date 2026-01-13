# Plus One

Link: https://leetcode.com/problems/separate-squares-i/description/?envType=daily-question&envId=2026-01-13

Approach: 

➡️ Ignore x-coordinate, because the line is horizontal

➡️ Treat each square independently (overlaps counted multiple times)

➡️ Total area changes monotonically as the line moves up

➡️ Use Binary Search on the y-coordinate

➡️➡️ For a guessed height mid:

➡️ If mid ≤ square bottom → whole square is above

➡️ If mid ≥ square top → whole square is below

➡️ Otherwise → square is partially split

        Area below = (mid − y) × side

        Area above = (y + side − mid) × side

➡️ Compare total area below and above

➡️ Adjust binary search range accordingly

➡️ Continue until required precision (1e-5) is achieved

➡️ ✅ Final mid gives the minimum y-coordinate where areas are equal