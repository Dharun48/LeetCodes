class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();

        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
            {
                s1=s1+ch;
            }
        }
       int n=s1.length();
       String rev="";
       for(int i=n-1;i>=0;i--)
       {
         rev=rev+s1.charAt(i);
       }
    return s1.equals(rev);
        
    }
}