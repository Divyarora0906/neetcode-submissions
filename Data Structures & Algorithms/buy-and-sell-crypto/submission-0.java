class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int i =0; i < prices.length; i++){
            if(buyprice > prices[i]){
                buyprice = prices[i];
            }
            int profit = prices[i]-buyprice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
