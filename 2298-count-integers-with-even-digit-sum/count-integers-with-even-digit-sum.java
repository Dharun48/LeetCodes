class Solution {
    public int countEven(int n) {
    int count=0;
        int sum=0;int b=0;
        for(int i=1;i<=n;i++)
        {
        sum=0;
         b=i;
        
           while(b>0)
           {
              int a=b%10;
              sum+=a;
              b/=10;
           }
              if(sum%2==0)
              {
                count++;
              }
           
        }return count;
    }
}