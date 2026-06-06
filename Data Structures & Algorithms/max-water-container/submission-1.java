class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int MaxUnits = Integer.MIN_VALUE;
        while(left < right){
            int Units = Math.min(heights[left],heights[right]);
            MaxUnits = Math.max(MaxUnits, Units*(right-left));
            if(heights[left] < heights[right]){
                left++;
            }
         else{
                right--;
            }
        }
        return MaxUnits;
    }
}
