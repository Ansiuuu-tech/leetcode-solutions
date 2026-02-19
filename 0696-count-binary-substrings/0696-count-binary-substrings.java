class Solution {
    public int countBinarySubstrings(String s) {
        int left = 0;
        int prevCount = 0;
        int currCount = 1;
        int result = 0;

        for (int right = 1; right < s.length(); right++) {

            if (s.charAt(right) == s.charAt(right - 1)) {
                currCount++;
            } else {
                result += Math.min(prevCount, currCount);
                prevCount = currCount;
                currCount = 1;
            }
        }

        result += Math.min(prevCount, currCount);

        return result;
    }
}
