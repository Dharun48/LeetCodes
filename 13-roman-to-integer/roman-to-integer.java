class Solution {
    public int romanToInt(String s)
     {
        int arr[]=new int[s.length()];
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I'){
            arr[i]=1;
            }

            else if(s.charAt(i)=='V')
            {
            arr[i]=5;
            }
            else if(s.charAt(i)=='X')
            {
            arr[i]=10;
            }
            else if(s.charAt(i)=='L')
            {
            arr[i]=50;
            }
            else if(s.charAt(i)=='C')
            {
            arr[i]=100;
            }
            else if(s.charAt(i)=='D')
            {
            arr[i]=500;
            }
            else
             {
            arr[i]=1000;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && arr[i]<arr[i+1])
            {
                a-=arr[i];
            }
            else
            {
                a+=arr[i];
            }
        }
        return a;
    }
}