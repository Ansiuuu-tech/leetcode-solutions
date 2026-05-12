class Solution {
    public int minimumEffort(int[][] tasks) {
        
        Arrays.sort(tasks,(a,b) ->{
            int da=a[1]-a[0];
            int db=b[1]-b[0];
            return db-da;
        });

        long res=0;
        long e=0;
        for(int i=0;i<tasks.length;i++)
        {
            int ac=tasks[i][0];
            int min=tasks[i][1];

            if(e<min){
            res+=(min-e);
            e=min;
            }

            e=e-ac;
        }
        return (int)res;
        }
    }
