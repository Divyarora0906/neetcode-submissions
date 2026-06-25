class Solution {
    private int hours(int[] piles, int n, int speed){
        int h = 0;
        for(int i = 0; i < n; i++){
            h += piles[i]/speed;
            if(piles[i]%speed != 0){
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int res = -1;
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int k =0; k < n; k++){
            if(piles[k] > high){
                high = piles[k];
            }
        } 
        while(low <= high){
            int guess = low+(high-low)/2;
            int hr = hours(piles, n, guess);
            if(hr > h){
                low = guess+1;
            }
            else{
                res = guess;
                high = guess-1;
            }
        }
        return res;
    }
}
