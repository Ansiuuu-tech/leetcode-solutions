class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        StringBuilder s1e = new StringBuilder();
        StringBuilder s1o= new StringBuilder();
        StringBuilder s2e = new StringBuilder();
        StringBuilder s2o= new StringBuilder();
        
       
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s1e.append(s1.charAt(i));
                s2e.append(s2.charAt(i));
            } else {
                s1o.append(s1.charAt(i));
                s2o.append(s2.charAt(i));
            }
        }
        
        
        char e1[]= s1e.toString().toCharArray();
        char e2[] = s2e.toString().toCharArray();
        char o1[] = s1o.toString().toCharArray();
        char o2[] = s2o.toString().toCharArray();
        
        Arrays.sort(e1); 
        Arrays.sort(e2);
        Arrays.sort(o1);
         Arrays.sort(o2);
        
        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);
    }
}