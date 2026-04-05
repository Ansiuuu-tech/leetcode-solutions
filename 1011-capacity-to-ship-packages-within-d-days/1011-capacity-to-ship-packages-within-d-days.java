class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int max=0,sum=0;
        for(int w: weights)
        {
                max=Math.max(w,max);
                sum+=w;
        }
        int left=max,right=sum,ans=right;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(helper(mid,weights,days)){
            right=mid;
            ans=mid;
            }
            else
            left=mid+1;
        }
        return ans;

    }

    public static boolean helper(int ans,int[] weights,int days)
    {
        int sum=0,d=1;
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i]<=ans)
            sum+=weights[i];
            else{
                d++;
                sum=weights[i];
            }
        }
            if(d>days)
            return false;
            else return true;
        
    }
}