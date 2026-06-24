class Solution {
    public int minPathSum(int[][] grid) {
    int arr[]=new int[grid[0].length];
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
            if(i==0&&j==0)
            {
                arr[j]=grid[i][j];
                continue;
            }
            int l=Integer.MAX_VALUE;
            int u=Integer.MAX_VALUE;
            if(i>0)
            u=arr[j];
            if(j>0)
            l=arr[j-1];

            arr[j]=grid[i][j]+Math.min(u,l);


        }
    }   
    return arr[grid[0].length-1];
    }
}