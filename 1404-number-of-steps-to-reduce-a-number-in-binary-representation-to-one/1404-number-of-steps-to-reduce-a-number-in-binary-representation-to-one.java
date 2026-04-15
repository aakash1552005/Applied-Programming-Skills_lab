class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        // Traverse from right to left (except first bit)
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';

            if (bit + carry == 1) {
                // odd → +1 then /2
                steps += 2;
                carry = 1;
            } else {
                // even → /2
                steps += 1;
            }
        }

        // If carry remains, one extra step needed
        return steps + carry;
    }
}