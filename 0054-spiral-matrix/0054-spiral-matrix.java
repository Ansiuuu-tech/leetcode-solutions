class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ls=new ArrayList<>();
        int t=0,b=matrix.length-1;
        int l=0,r=matrix[0].length-1;

        while(t<=b&&l<=r)
        {
            for(int i=t;i<=r;i++)
            ls.add(matrix[t][i]);
            t++;

            for(int j=t;j<=b;j++)
            ls.add(matrix[j][r]);
            r--;

            if(t<=b){
                for(int k=r;k>=l;k--)
                ls.add(matrix[b][k]);
                b--;
            }

            if(l<=r)
            {
                for(int m=b;m>=t;m--)
                ls.add(matrix[m][l]);
                l++;
            }

            }
        
        return ls;
    }
}