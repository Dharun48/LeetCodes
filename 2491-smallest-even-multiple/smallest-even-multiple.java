class Solution {
    public int smallestEvenMultiple(int n) {
        int b;int c;
        if(n%2==0)
        {
            b=n*n;
            c=b;
        }
        
        else
        {
            c=n*2;
            n=c;
        }
        return n;
    }
}