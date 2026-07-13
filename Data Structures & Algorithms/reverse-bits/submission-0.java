public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            // Extract the bit at position i
            int bit = (n >> i) & 1;
            // Place the bit at position (31 - i) in the result
            res |= (bit << (31 - i));
        }
        return res;
    }
}