class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                al.add(grid[i][j]);
            }
        }
        Collections.sort(al);
        int median=al.get(al.size()/2);
        int c=0;
        for(int num: al)
        {
            if(Math.abs(num-median)%x!=0)
            return -1;
            c=c+Math.abs(num-median)/x; 
        }

    
    return c;
    }
}