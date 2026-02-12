class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        StringBuilder s1=new StringBuilder();
        s1.append(str1+str2);
        StringBuilder s2=new StringBuilder();
        s2.append(str2+str1);
        String s3="";
        if(s1.toString().equals(s2.toString()))
        {
           int n=gcd(n1,n2);
        s3+=str1.substring(0,n);
        return s3;
        }
        else{
            return "";
        }
    }
     public int gcd(int n1,int n2){
        if(n2==0)
        return n1;
        else
        return gcd(n2,n1%n2);
     }
}