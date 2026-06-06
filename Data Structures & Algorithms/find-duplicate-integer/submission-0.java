class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> Map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Map.put(nums[i], Map.getOrDefault(nums[i], 0)+1);
            if(Map.get(nums[i]) > 1){
                return nums[i];
            }
        }
        return -1;
    }
}
