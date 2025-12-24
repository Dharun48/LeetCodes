class Solution {
    public boolean isAnagram(String s, String t) 
    {
       if(s.length()!=t.length())
       {
        return false;
       }
       char[] b=t.toCharArray();
        char[] a=s.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }
}