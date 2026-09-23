class Solution {
    public int minOperations(int[] A, int x) {
        int k = -x, n = A.length;
        for (int a : A) k += a;
        if (k < 0) 
        return -1;
        if (k == 0)
        return n;

        int res = -1, i = 0, s = 0;
        for (int j = 0; j < n; j++) {
            s += A[j];
            while (s > k)
                s -= A[i++];

            if (s == k)
                res = Math.max(res, j - i + 1);
        }

        return res < 0 ? -1 : n - res;
    }
}