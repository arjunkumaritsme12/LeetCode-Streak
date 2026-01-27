import java.util.*;

class Solution {

    static class Edge {
        int to;
        int cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public int minCost(int n, int[][] edges) {

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, 2 * w));
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            int node = (int) cur[1];

            if (cost > dist[node]) continue;

            if (node == n - 1) return (int) cost;

            for (Edge next : graph.get(node)) {
                long newCost = cost + next.cost;
                if (newCost < dist[next.to]) {
                    dist[next.to] = newCost;
                    pq.offer(new long[]{newCost, next.to});
                }
            }
        }

        return -1;
    }
}
