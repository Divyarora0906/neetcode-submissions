class Solution {
    public int hammingWeight(int n) {
        int i = 0;
        int countone = 0;
        while(i < 32){
            if((n&1)==1){
                countone++;
            }
            n=n>>1;
            i++;
        }
        return countone;
    }
}
