import java.util.*;

class Solution {

    static class State {
        int x, y, t;
        long cost;
        State(int x, int y, int t, long cost) {
            this.x = x;
            this.y = y;
            this.t = t;
            this.cost = cost;
        }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        long INF = Long.MAX_VALUE;

        long[][][] dist = new long[m][n][k + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dist[i][j], INF);

        // Pre-sort cells by grid value
        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells.add(new int[]{grid[i][j], i, j});
        cells.sort(Comparator.comparingInt(a -> a[0]));

        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.cost));
        dist[0][0][0] = 0;
        pq.offer(new State(0, 0, 0, 0));

        int[] dx = {0, 1};
        int[] dy = {1, 0};

        // teleportUsed[t] = index up to which teleport expansion is done
        int[][] teleportUsed = new int[k + 1][];
        for (int t = 0; t <= k; t++) teleportUsed[t] = new int[]{0};

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            if (cur.cost > dist[cur.x][cur.y][cur.t]) continue;

            if (cur.x == m - 1 && cur.y == n - 1)
                return (int) cur.cost;

            // Normal moves
            for (int d = 0; d < 2; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];
                if (nx < m && ny < n) {
                    long nc = cur.cost + grid[nx][ny];
                    if (nc < dist[nx][ny][cur.t]) {
                        dist[nx][ny][cur.t] = nc;
                        pq.offer(new State(nx, ny, cur.t, nc));
                    }
                }
            }

            // Teleport moves
            if (cur.t < k) {
                int idx = teleportUsed[cur.t + 1][0];
                while (idx < cells.size() && cells.get(idx)[0] <= grid[cur.x][cur.y]) {
                    int nx = cells.get(idx)[1];
                    int ny = cells.get(idx)[2];
                    if (cur.cost < dist[nx][ny][cur.t + 1]) {
                        dist[nx][ny][cur.t + 1] = cur.cost;
                        pq.offer(new State(nx, ny, cur.t + 1, cur.cost));
                    }
                    idx++;
                }
                teleportUsed[cur.t + 1][0] = idx;
            }
        }

        return -1;
    }
}
