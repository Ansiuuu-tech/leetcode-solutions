class Solution {

    public int[][] rotateGrid(int[][] grid, int k) {

        int t = 0, l = 0;
        int b = grid.length - 1;
        int r = grid[0].length - 1;

        while (t < b && l < r) {

            int len = b - t;
            int wid = r - l;

            int perimeter = 2 * len + 2 * wid;

            int rot = k % perimeter;

            while (rot-- > 0) {

                int temp = grid[t][l];

                for (int i = l; i < r; i++) {
                    grid[t][i] = grid[t][i + 1];
                }

                for (int i = t; i < b; i++) {
                    grid[i][r] = grid[i + 1][r];
                }

                for (int i = r; i > l; i--) {
                    grid[b][i] = grid[b][i - 1];
                }

                for (int i = b; i > t; i--) {
                    grid[i][l] = grid[i - 1][l];
                }

                grid[t + 1][l] = temp;
            }

            t++;
            l++;
            b--;
            r--;
        }

        return grid;
    }
}