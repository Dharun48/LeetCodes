class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        String v="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(vowels.indexOf(ch)!=-1)
            {
                v+=ch;
            }
        }
        String result="";
        int k=v.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(vowels.indexOf(ch)!=-1)
            {
                result+=v.charAt(k--);
            }else
            {
                result+=ch;
            }
        }
        return result;
    }
}
