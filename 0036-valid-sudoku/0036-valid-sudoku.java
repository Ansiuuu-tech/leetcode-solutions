class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row[]=new HashSet[9];
           HashSet<Character> col[]=new HashSet[9];
              HashSet<Character> boxes[]=new HashSet[9];

              for(int i=0;i<9;i++)
              {
                row[i]=new HashSet<>();
                col[i]=new HashSet<>();
                boxes[i]=new HashSet<>();
              }

              for(int i=0;i<9;i++)
              {
                for(int j=0;j<9;j++)
                {
                    if(board[i][j]=='.')
                    continue;
                    char n=board[i][j];
                    int box=(i/3)*3+(j/3);
                    if(row[i].contains(n)||col[j].contains(n)||boxes[box].contains(n))
                    return false;

                    row[i].add(n);
                    col[j].add(n);
                    boxes[box].add(n);

                }
              }
              return true;
    }
}