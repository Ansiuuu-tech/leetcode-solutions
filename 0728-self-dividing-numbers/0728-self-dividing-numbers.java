class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
        int t=i;
        int f=0;
        while(t>0)
        {  
            int rem=t%10;
            t/=10;
            
            if(rem==0||i%rem!=0){
            f=1;
            break;}
        }
        if(f==0)
        ls.add(i);
        }
        return ls;
    }
}