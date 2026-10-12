class Solution {
    public int findCircleNum(int[][] M) {
        int vis[]=new int[M.length];
        int c=0;
        for(int i=0;i<M.length;i++)
        {
            if(vis[i]==0)
            {
          
            dfs(M,vis,i);
              c++;
        }
           }
           return c;
}
public void dfs(int M[][],int vis[],int i)
{
    for(int j=0;j<M.length;j++)
    {
        if(M[i][j]==1 && vis[j]==0){
        vis[j]=1;
        dfs(M,vis,j);
        }
    }
}
}
