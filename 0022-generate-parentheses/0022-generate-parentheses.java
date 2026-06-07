class Solution {

    void solve(List<String> ans, int open, int close, String curr, int n) {

        if(curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        if(open < n) {
            solve(ans, open + 1, close, curr + "(", n);
        }

        if(close < open) {
            solve(ans, open, close + 1, curr + ")", n);
        }
    }

    public List<String> generateParenthesis(int n) {
                int t=0;
        List<String> ans = new ArrayList<>();

        solve(ans, 0, 0, "", n);

        return ans;
    }
}