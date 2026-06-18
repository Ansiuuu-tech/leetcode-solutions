class Solution {
    public double angleClock(int hour, int minutes) {
           double minAng=6.0*minutes;
           double hrAng=30*(hour%12.0)+minutes/2.0;
           double res=Math.abs(hrAng-minAng);
           return Math.min(res,360-res);  
    }
}