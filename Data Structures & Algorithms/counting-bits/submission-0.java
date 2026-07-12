class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;
        
        for (int i = 1; i <= n; i++) {
            // Update offset if we hit a power of 2
            if (offset * 2 == i) {
                offset = i;
            }
            // DP relation
            dp[i] = 1 + dp[i - offset];
        }
        
        return dp;
    }
}
