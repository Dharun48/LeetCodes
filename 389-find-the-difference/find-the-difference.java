class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        // add characters of t
        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }

        // subtract characters of s
        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }

        return (char) sum;
    }
}
