import java.util.*;

class Solution {

    public boolean bfs(int i, int j, char[][] grid, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j, -1, -1});
        visited[i][j] = true;

        int[][] dirs = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int x = curr[0];
            int y = curr[1];
            int px = curr[2];
            int py = curr[3];

            for (int[] d : dirs) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (grid[nx][ny] != grid[x][y]) {
                    continue;
                }

                if (nx == px && ny == py) {
                    continue;
                }

                if (visited[nx][ny]) {
                    return true;
                }

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, x, y});
            }
        }

        return false;
    }

    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    if (bfs(i, j, grid, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}