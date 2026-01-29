class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
{
    ArrayList<Integer> div=new ArrayList<>();   
    for(int i=left;i<=right;i++)
    {
        int temp=i;
        boolean bool=true; 
        while(temp>0)
          {
            int digit=temp%10;
            if(digit==0||i%digit!=0)
            {
                bool=false;
                break;
            }
            temp/=10;
           }
        if(bool)
        div.add(i);
        }
     return div;
    } 
  }
