class Solution {
    public String reverseWords(String s) {

        String[] words=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
          for (int i=0;i<words.length;i++)
           {
            String word=words[i];
            StringBuilder revWord=new StringBuilder(word);
            result.append(revWord.reverse());
            if (i!=words.length-1) 
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
}