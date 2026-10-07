
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> a = new ArrayList<>();
        rm(s, a, 0, 0, new char[] { '(', ')' });
        return a;
    }

    void rm(String s, List<String> a, int i, int j, char[] p) {
        int c = 0;

        for (int k = i; k < s.length(); k++) {
            if (s.charAt(k) == p[0]) 
            c++;
            if (s.charAt(k) == p[1])
             c--;

            if (c < 0) {
                for (int x = j; x <= k; x++) {
                    if (s.charAt(x) == p[1] && (x == j || s.charAt(x - 1) != p[1])) {
                        rm(s.substring(0, x) + s.substring(x + 1), a, k, x, p);
                    }
                }
                return;
            }
        }

        String r = new StringBuilder(s).reverse().toString();

        if (p[0] == '(')
            rm(r, a, 0, 0, new char[]{')', '('});
        else
            a.add(r);
    }
}
