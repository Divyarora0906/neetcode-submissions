class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return recursiveHelper(n, memo);
    }
    private int recursiveHelper(int n , HashMap<Integer, Integer> memo){
        if(n <= 2){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int ways = recursiveHelper(n-1, memo) +  recursiveHelper(n-2, memo);
        memo.put(n , ways);
        return ways;
    }
}
