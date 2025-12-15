class Solution {
    public int arraySign(int[] num) {
        int sign=1;

        for (int i=0;i<num.length;i++) {
            if (num[i]==0)
             {
                return 0;
            }
            if(num[i]<0) 
            {
                sign=-sign;
            }
        }
        return sign;
    }
}
