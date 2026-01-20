class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int n=nums.length;
        int arr[]=new int[n*2];
        for(int i=0;i<nums.length;i++)
          {
            arr[i]=nums[i];
          }
          for(int j=0+n;j<nums.length*2;j++)
          {
            arr[j]=nums[j-n];
          }
          return arr;
    }
}