class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m+n;
     int arr[]=new int[a];
     for(int i=0;i<m;i++)
     {
        arr[i]=nums1[i];
     }
        for(int j=0+m;j<m+n;j++)
        {
            arr[j]=nums2[j-m];
        }

     Arrays.sort(arr);
     for(int i=0;i<a;i++)
     {
        nums1[i]=arr[i];
     }   
    }
}