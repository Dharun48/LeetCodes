class Solution {
    public int finalValueAfterOperations(String[] operations)
    {
       int sum=0;
       for(int i=0;i<operations.length;i++)
       {
        String ch=operations[i];
         char s=ch.charAt(1);
         if(s=='+')
         {
            sum++;
         }
         else if(s=='-')
         {
            sum--;
         }
       } 
       return sum;
    }
}