class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> newMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            newMap.put(arr[i], newMap.getOrDefault(arr[i], 0) + 1);
        }
        for(String s: arr){
            if(newMap.get(s) == 1){
                k--;
                if(k == 0){
                    return s;
                }
            }
        }
        return "";
    }
}