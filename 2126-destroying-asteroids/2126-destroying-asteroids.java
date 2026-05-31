class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long csum=mass;
        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>csum)
            return false;
            else
            csum+=asteroids[i];
        }
        return true;
    }
}