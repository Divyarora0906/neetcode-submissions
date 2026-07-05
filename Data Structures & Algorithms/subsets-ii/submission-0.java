class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> tobeReturned = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, tobeReturned, new ArrayList<>(), 0);
        return tobeReturned;
    }
    public void backtrack(int[] nums, List<List<Integer>> tobeReturned, List<Integer> current, int index){
        tobeReturned.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, tobeReturned, current, i+1);
            current.remove(current.size()-1);
        }

    }
}
