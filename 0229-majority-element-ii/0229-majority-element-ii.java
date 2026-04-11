class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnd1=0,cnd2=0,c1=0,c2=0;
        for(int num:nums)
        {
            if(num==cnd1)
            c1++;
            else if(num==cnd2)
            c2++;
            else if(c1==0){
            cnd1=num;
            c1=1;
            }
            else if(c2==0)
            {
                cnd2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
            c1=0;c2=0;
            for(int n: nums)
            {
                if(cnd1==n)
                c1++;
                else if(cnd2==n)
                c2++;
            }
        ArrayList<Integer> re=new ArrayList<>();
            if(c1>nums.length/3)
            re.add(cnd1);
            if(c2>nums.length/3)
            re.add(cnd2);

            return re;
        }
    }
