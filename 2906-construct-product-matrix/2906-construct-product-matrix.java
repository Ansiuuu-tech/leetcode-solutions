class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int mod = 12345;

        int[][] res = new int[n][m];

        int pre = 1;
        for (int i = 0; i < n * m; i++) {
            int r = i / m, c = i % m;
            res[r][c] = pre;
            pre = (int)((1L * pre * (grid[r][c] % mod)) % mod);
        }

        int suf = 1;
        for (int i = n * m - 1; i >= 0; i--) {
            int r = i / m, c = i % m;
            res[r][c] = (int)((1L * res[r][c] * suf) % mod);
            suf = (int)((1L * suf * (grid[r][c] % mod)) % mod);
        }

        return res;
    }
}