# Plus One

Link: https://leetcode.com/problems/separate-squares-ii/description/?envType=daily-question&envId=2026-01-14
Approach: 

1. Convert squares into events (Sweep Line)

    ➡️ For each square [x, y, l]

        Add event at y → interval [x, x + l) starts

        Add event at y + l → interval [x, x + l) ends

2. Sort events by y-coordinate

    ➡️ Process from bottom to top (vertical sweep).

3. Compress x-coordinates

    ➡️ Collect all x and x + l values.

    ➡️ This helps handle large coordinates efficiently.

4. Use Segment Tree on x-axis

    ➡️ Maintains union covered width of active x-intervals.

    ➡️ Overlapping intervals are counted only once.

5. First sweep → calculate total union area

    ➡️ Between consecutive y-values:

        area += coveredWidth × (currentY − previousY)


6. Second sweep → find split line

    ➡️ Accumulate area from bottom.

    ➡️ When accumulated area reaches half of total area, stop.

7. Compute exact y-coordinate

    ➡️ Interpolate within the current y-segment:

        answer = prevY + (halfArea − currentArea) / coveredWidth


8. Return the minimum y

    ➡️ This y gives equal area above and below.