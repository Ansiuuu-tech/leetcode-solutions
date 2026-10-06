class Solution {
    public int minAddToMakeValid(String s) {
        int abs = 0, count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                count++;
            else if (count > 0)
                count--;
            else
                abs++;
        }
        return abs + count;
    }
}