class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
       int n=letters.length;
       Arrays.sort(letters);
       char res=letters[0];
       for(int i=0;i<n;i++)
       {
           if(letters[i]>target)
           {
                 res=letters[i];
                 break;
           }
       } 
       return res;
    }
}