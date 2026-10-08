class Solution {
    public String removeOuterParentheses(String s) {
        int pr = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && pr++ > 0 || s.charAt(i) == ')' && --pr > 0)
                sb.append(s.charAt(i));

        }
        return sb.toString();
    }
}