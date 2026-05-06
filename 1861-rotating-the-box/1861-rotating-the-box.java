class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int r=boxGrid.length;
        int c=boxGrid[0].length;
        char res[][]=new char[c][r];
        for(char[] row:res){
                Arrays.fill(row,'.');
        }
                for(int i=0;i<r;i++)
                {
                    int p=c-1;
                    for(int j=c-1;j>=0;j--)
                    {
                        if(boxGrid[i][j]=='*'){
                        res[j][r-1-i]='*';
                        p=j-1;}
                        else if(boxGrid[i][j]=='#')
                        res[p--][r-1-i]='#';
                    }
                    }
                    return res;
                }
    }
