class Solution {
    public void reverseString(char[] s)
     {
          int n=s.length;
          char a[]=new char[n];
          int ch=0;
          for(int i=n-1;i>=0;i--)
          {
            a[ch]=s[i];
            ch++;
          }
          for(int i=0;i<n;i++)
          {
            s[i]=a[i];
          }
     }
   
}