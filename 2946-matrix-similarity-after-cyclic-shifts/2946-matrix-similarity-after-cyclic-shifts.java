class Solution {
    public boolean areSimilar(int[][] mat, int k) {
      k=k%mat[0].length;
      int n=mat[0].length;
      int arr[][]=new int[mat.length][mat[0].length];
    
        for(int j=0;j<mat.length;j++)
        {
            for(int l=0;l<mat[0].length;l++)
            {
                if(j%2==0)
                {
                   arr [j][l]=mat[j][(l+k)%n];
                }
                else{
                    arr[j][(l+k)%n]=mat[j][l];
                }
            
        }
      }
        
      for(int i=0;i<mat.length;i++)
      {
        for(int j=0;j<mat[0].length;j++)
        {
            if(arr[i][j]!=mat[i][j])
            return false;
        }
      }
      return true;

    }
}