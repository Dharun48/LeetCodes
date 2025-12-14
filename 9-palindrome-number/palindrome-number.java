class Solution {
    public boolean isPalindrome(int x) {
       int temp=x;
        int a,rev=0;
       while(temp>0)
       {
         a=temp%10;
        rev=rev*10+a;
         temp/=10;
       } 
       if(x==rev)
       {
        return true;
       }
       else
       {
        return false;
       }
        
    }
}