class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> combinationSum = new ArrayList<>();
       Arrays.sort(candidates);
       List<Integer> eachArrayList = new ArrayList<>();
       Combinations(combinationSum, eachArrayList, target, candidates, 0);
        return combinationSum;
    }
    public void Combinations( List<List<Integer>> combinationSum,  List<Integer> eachArrayList, int target, int[] candidates, int i){
        if(target < 0){
            return;
        }
        if(target==0){
            combinationSum.add(new ArrayList<>(eachArrayList));
            return;
        }
       for(int j = i; j < candidates.length; j++){
        if(j > i && candidates[j] == candidates[j-1]) continue;
        eachArrayList.add(candidates[j]);
        Combinations(combinationSum, eachArrayList, target-candidates[j], candidates, j+1);
         eachArrayList.remove( eachArrayList.size()-1);
       }
    }
}
