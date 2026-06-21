class Solution {
    private int BinarySearch(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
         
        }
           return -1;
    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int targets = nums[high];
        int index = -1;
        int ans = 0;
        while(low <= high)
        {
            int guess = low + (high - low)/2;
            if(nums[guess] > targets){
                low = guess+1;
            }else{
                index = guess;
                high = guess-1;
            }
        }
        System.out.println(index);;
        //We have two blocks
        //FIrst one is low = 0 high = index-1;
        int lw = 0;
        int hg = index - 1;
        if(hg >= 0 && nums[lw] <= target && nums[hg] >= target){
            ans = BinarySearch(nums,lw,hg,target);
        }
        else{
        lw = index;
        hg = nums.length-1;
        ans = BinarySearch(nums,lw,hg,target);
        }
        return ans;
    }
}
