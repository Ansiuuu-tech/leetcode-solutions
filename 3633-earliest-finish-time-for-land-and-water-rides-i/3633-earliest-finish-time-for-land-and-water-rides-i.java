class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++)
        {
            for(int j=0;j<waterStartTime.length;j++)
            {
                int lf=landStartTime[i]+landDuration[i];
                int ws=Math.max(lf,waterStartTime[j]);
                int f1=ws+waterDuration[j];

                int wf=waterStartTime[j]+waterDuration[j];
                int ls=Math.max(wf,landStartTime[i]);
                int f2=ls+landDuration[i];

                res=Math.min(res,Math.min(f1,f2));
            }
        }
        return res;
    }
}