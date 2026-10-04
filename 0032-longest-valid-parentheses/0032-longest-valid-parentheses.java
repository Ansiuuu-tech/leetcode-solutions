class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] e = new int[2 * n + 1];

        for (int i = 0; i < e.length; i++)
            e[i] = -1;

        int h = 0, a = 0;
        e[n] = 0;

        for (int p = 1; p <= n; p++) {
            if (s.charAt(p - 1) == '(') {
                h++;
                e[h + n] = p;
            } else {
                e[h + n] = -1;
                h--;

                int i = h + n;

                if (e[i] == -1)
                    e[i] = p;
                else
                    a = Math.max(a, p - e[i]);
            }
        }

        return a;
    }
}