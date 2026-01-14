package Day-14;
import java.util.*;

class Solution {

    static class SegmentTree {
        int n;
        long[] coveredWidth;
        int[] coverCount;
        int[] xs;

        SegmentTree(int[] xs) {
            this.xs = xs;
            this.n = xs.length - 1;
            coveredWidth = new long[4 * n];
            coverCount = new int[4 * n];
        }

        void update(int idx, int left, int right, int ql, int qr, int val) {
            if (qr <= left || right <= ql) return;

            if (ql <= left && right <= qr) {
                coverCount[idx] += val;
            } else {
                int mid = (left + right) / 2;
                update(idx * 2 + 1, left, mid, ql, qr, val);
                update(idx * 2 + 2, mid, right, ql, qr, val);
            }

            if (coverCount[idx] > 0) {
                coveredWidth[idx] = xs[right] - xs[left];
            } else {
                if (right - left == 1) coveredWidth[idx] = 0;
                else coveredWidth[idx] =
                        coveredWidth[idx * 2 + 1] + coveredWidth[idx * 2 + 2];
            }
        }

        long getCoveredWidth() {
            return coveredWidth[0];
        }
    }

    static class Event {
        int y, type, x1, x2;
        Event(int y, int type, int x1, int x2) {
            this.y = y;
            this.type = type;
            this.x1 = x1;
            this.x2 = x2;
        }
    }

    public double separateSquares(int[][] squares) {
        List<Event> events = new ArrayList<>();
        TreeSet<Integer> xSet = new TreeSet<>();

        for (int[] s : squares) {
            int x = s[0], y = s[1], l = s[2];
            events.add(new Event(y, +1, x, x + l));
            events.add(new Event(y + l, -1, x, x + l));
            xSet.add(x);
            xSet.add(x + l);
        }

        events.sort(Comparator.comparingInt(e -> e.y));

        int[] xs = new int[xSet.size()];
        int i = 0;
        for (int v : xSet) xs[i++] = v;

        Map<Integer, Integer> index = new HashMap<>();
        for (i = 0; i < xs.length; i++) index.put(xs[i], i);

        long totalArea = computeTotalArea(events, xs, index);
        double half = totalArea / 2.0;

        SegmentTree tree = new SegmentTree(xs);
        long area = 0;
        int prevY = events.get(0).y;

        for (Event e : events) {
            long covered = tree.getCoveredWidth();
            long deltaY = e.y - prevY;
            long gain = covered * deltaY;

            if (area + gain >= half) {
                return prevY + (half - area) / covered;
            }

            area += gain;
            tree.update(0, 0, xs.length - 1,
                    index.get(e.x1), index.get(e.x2), e.type);
            prevY = e.y;
        }

        return 0.0;
    }

    private long computeTotalArea(List<Event> events, int[] xs,
                                  Map<Integer, Integer> index) {
        SegmentTree tree = new SegmentTree(xs);
        long area = 0;
        int prevY = events.get(0).y;

        for (Event e : events) {
            area += tree.getCoveredWidth() * (long) (e.y - prevY);
            tree.update(0, 0, xs.length - 1,
                    index.get(e.x1), index.get(e.x2), e.type);
            prevY = e.y;
        }

        return area;
    }
}
