class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int color[] = new int[V];

        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!check(i, graph, color))
                    return false;
            }
        }

        return true;
    }

    public boolean check(int start, int graph[][], int color[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int n = q.poll();

            for (int it : graph[n]) {
                if (color[it] == -1) {
                    color[it] = 1 - color[n];
                    q.add(it);
                }
                else if (color[it] == color[n]) {
                    return false;
                }
            }
        }

        return true;
    }
}