class Solution {
    public int[] shortestToChar(String s, char c)
     {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
          int count=Integer.MAX_VALUE; 
          for(int j=0;j<s.length();j++) 
          {
             if(s.charAt(j)==c)
               {
                  int dist=Math.abs(i-j);
                    if(dist<count)
                    {
                        count=dist;
                    }
               }
            arr[i]=count;
          }
        }
        return arr;
    }
}