class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int left = 0;
    int arr[] = new int[nums.length-k+1];
    int arrindex = 0;
    for(int i = 0; i <= nums.length-k; i++){
        int max = nums[i];
        for(int j = i; j < i+k; j++){
            if(nums[j]>max){
                max = nums[j];
            }
        }
        arr[arrindex++] = max;
    }
    return arr;
    }
}
