class Solution {
    public int findNthDigit(int n) {
        long len = 1;     // digit length
        long count = 9;   // count of numbers
        long start = 1;   // starting number

        // Step 1: find digit-length group
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        // Step 2: find actual number
        start += (n - 1) / len;

        // Step 3: get the digit
        String s = Long.toString(start);
        return s.charAt((int)((n - 1) % len)) - '0';
    }
}
