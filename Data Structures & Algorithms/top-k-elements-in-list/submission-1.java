class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            newMap.put(nums[i], newMap.getOrDefault(nums[i], 0)+1);
        }
        ArrayList<Integer> newList = new ArrayList<>(newMap.keySet());
        int mo = 0;
        newList.sort((a,b)-> newMap.get(b) - newMap.get(a));
        int arr[] = new int[k];
        for(int key: newMap.keySet()){
            int value = newMap.get(key);
            if(value >= k){
                newList.add(key);
            }
        }
        for(int i = 0; i < k; i++){
            arr[i] = newList.get(i);
        }
        return arr;
    }
}
