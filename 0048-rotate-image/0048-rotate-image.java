class Solution {
    public void rotate(int[][] matrix) {
        int  arr[][]=new int[matrix.length][matrix.length];
        int r=0;
        while(r<matrix.length){
            int j=0;
            for(int i=matrix.length-1;i>=0;i--)
            {
                arr[r][j]=matrix[i][r];
                j++;
            }
            r++;
        }
  for(int i=0;i<matrix.length;i++)
      {
        for(int j=0;j<matrix.length;j++)
        {
         //   System.out.print(arr[i][j]+" ");
         matrix[i][j]=arr[i][j];
        }
      }
    }
}