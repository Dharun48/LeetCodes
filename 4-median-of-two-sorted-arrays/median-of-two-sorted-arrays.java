class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int a=nums1.length;
        int b=nums2.length;
        int arr[]=new int[a+b];
       for(int i=0;i<a;i++)
       {
          arr[i]=nums1[i];
       }
        for(int i=0;i<b;i++)
       {
          arr[a+i]=nums2[i];
       }
       Arrays.sort(arr);
       double res=0;
       int n=arr.length/2;
        if(arr.length%2==1)
        {
             res=(double)arr[n];
            return res;
        }
        else
        {
            double sum=0;
            sum=(double)arr[n-1]+(double)arr[n];
            res=sum/2.0;
            return res;
        }
    }
}