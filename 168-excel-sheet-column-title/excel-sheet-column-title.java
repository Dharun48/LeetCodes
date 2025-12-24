class Solution {
    public String convertToTitle(int columnNumber) 
    {
        String a="";
        while(columnNumber>0)
        {
           columnNumber--;
            char ch=(char)('A'+columnNumber%26);
            a=ch+a;
            columnNumber/=26;
        }
        return a;
    }
}