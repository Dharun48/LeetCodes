class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        int n=stones.length;
        if (n==1)
            return stones[0];
        while(n>1) 
        {
            for (int i=0;i<n-1;i++) 
            {
                for(int j=0;j<n-i-1;j++)
                {
                if (stones[j]>stones[j+1]) 
                {
                    int temp=stones[j];
                    stones[j]=stones[j+1];
                    stones[j+1]=temp;
                }
                }
            }
            int y=stones[n-1];
            int x=stones[n-2];

            if (y==x)
               {
                n-=2;
                 }
             else 
            {
                stones[n-2]=y-x;
                n-=1; 
            }
        }

        return n==1?stones[0]:0;
    }
}
