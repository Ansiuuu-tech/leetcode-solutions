class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            int c=0;
            while(!st.isEmpty()&& heights[i]>st.peek())
            {
                c++;
                st.pop();
            }
            if(!st.isEmpty())
            c++;

            res[i]=c;
            st.push(heights[i]);

            
        }
        return res;
    }
}