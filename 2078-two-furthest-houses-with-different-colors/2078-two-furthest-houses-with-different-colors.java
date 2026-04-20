class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int md=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(colors[i]!=colors[j])
                {
                    md=Math.max(md,j-i);
                }
            }
        }
        return md;
    }
}