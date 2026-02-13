class Solution {
    public String reverseVowels(String s) {
      char arr[]=s.toCharArray();
      int left=0,right=arr.length-1;
      while(left<right)
      {
        while(left<right&&!isVowel(arr[left]))
        left++;
        while(right>left&&!isVowel(arr[right]))
        right--;

        char t=arr[left];
        arr[left]=arr[right];
        arr[right]=t;
        left++;
        right--;
      }
      return new String(arr);

}
public boolean isVowel(char c){
boolean res="aeiouAEIOU".indexOf(c)!=-1;
return res;
}
}