class Solution {
    public boolean isHappy(int n) 
    {
        while(n!=1)
        {
            int sum=0;
            int a=n;
            while(a!=0)
            {
             int d=a%10;
             sum+=d*d;
             a/=10;
            }
            n=sum;
            if(n==4)
            {
                return false;
            }
        }
        return true;
    }
}