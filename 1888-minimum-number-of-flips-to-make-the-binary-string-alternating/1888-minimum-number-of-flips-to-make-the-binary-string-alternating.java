class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String t = s + s;

        int diff1 = 0, diff2 = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 2 * n; i++) {
            char e1 = (i % 2 == 0) ? '0' : '1'; 
            char e2 = (i % 2 == 0) ? '1' : '0'; 

            if (t.charAt(i) != e1) diff1++;
            if (t.charAt(i) != e2) diff2++;

            if (i >= n) {
                char oe1 = ((i - n) % 2 == 0) ? '0' : '1';
                char oe2 = ((i - n) % 2 == 0) ? '1' : '0';

                if (t.charAt(i - n) != oe1) diff1--;
                if (t.charAt(i - n) != oe2) diff2--;
            }

            if (i >= n - 1) {
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;
    }
}