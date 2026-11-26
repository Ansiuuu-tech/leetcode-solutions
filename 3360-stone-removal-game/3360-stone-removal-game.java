class Solution {
    public boolean canAliceWin(int i) {
       if(i<10)
       return false;
       else if(i>=10&&i<19)
       return true;
       else if(i>=19 && i<27)
       return false;
       else if(i>=27 && i<34)
       return true;
       else if(i>=34 && i<40)
       return false;
       else if(i>=40 && i<45)
       return true;
       else if(i>=45 && i<49)
       return false;
       else 
       return true; 


    }
}