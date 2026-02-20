class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < a.length; i++) {
            boolean d = false;
            
            while(!s.isEmpty() && s.peek() > 0 && a[i] < 0) {
                if(Math.abs(a[i]) > Math.abs(s.peek())) {
                    s.pop();
                }
                else if(Math.abs(a[i]) == Math.abs(s.peek())) {
                    s.pop();
                    d = true;
                    break;
                }
                else {
                    d = true;
                    break;
                }
            }
            
            if(!d) {
                s.push(a[i]);
            }
        }
        
        int[] r = new int[s.size()];
        
        for(int i = s.size() - 1; i >= 0; i--) {
            r[i] = s.pop();
        }
        
        return r;
    }
}