class Solution {
    public int divide(int dividend, int divisor) {

  if (divisor == 1)
   return dividend;

        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            return -dividend;
        }
        
        boolean negative = (dividend < 0) ^ (divisor < 0);

  
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int c = 0;


        while (dvd >= dvs) {
            dvd = dvd - dvs;
            c++;
        }

        
        return negative ? -c : c;
    }
}
