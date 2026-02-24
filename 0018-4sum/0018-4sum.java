class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1])
            continue;
            int a=nums[i];

            for(int j=i+1;j<n;j++)
            {
                if(j>i+1&& nums[j]==nums[j-1])
                continue;
                int b=nums[j];
                long rem=target-((long)a+b);
                List<List<Integer>> out=twoSum(nums,rem,j+1);
                for(int k=0;k<out.size();k++)
                {
                    List<Integer> ans=out.get(k);
                    ans.add(a);
                    ans.add(b);
                    res.add(ans);
                }
            }
        }
        return res;

    }
 public List<List<Integer>> twoSum(int[] nums, long target,int st) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        int l=st;
        int r=n-1;
        while(l<r){
            long sum=nums[l]+nums[r];
            if(sum==target){
            List<Integer> ans=new ArrayList<>();
            ans.add(nums[l]);
            ans.add(nums[r]);
            res.add(ans);
            l++;
            r--;
            while(l<r && nums[l]==nums[l-1])
            l++;
            while(l<r && nums[r]==nums[r+1])
            r--;
            }
            else if(sum<target)
            l++;
            else
            r--;
        }
        return res;

    }
}