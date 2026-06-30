class Solution {
    void getAllCombinations(int[] nums, int idx, int target,Set<List<Integer>> ans, List<Integer> combination){
        if(idx == nums.length || target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(combination));
            return;
        }
        combination.add(nums[idx]);
        getAllCombinations(nums, idx+1, target-nums[idx], ans, combination);
        getAllCombinations(nums, idx, target-nums[idx], ans, combination);
        combination.remove(combination.size() - 1);
        getAllCombinations(nums, idx+1, target, ans, combination);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> combination = new ArrayList<>();
        getAllCombinations(nums, 0, target, ans, combination);
        return new ArrayList<>(ans);
    }
}
