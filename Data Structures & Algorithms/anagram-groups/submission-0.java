class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        String arr[] = new String[strs.length];

        int j = 0;
        while(j < strs.length){
            char sortedString[] = strs[j].toCharArray();
            Arrays.sort(sortedString);
            String sort = new String(sortedString);
            arr[j] = sort;
            j++;
        }
        int i  = 0;
        while(i < strs.length){
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
            i++;
        }
        System.out.println(map);
        for(ArrayList<Integer> indexes : map.values()){
            List<String> temp = new ArrayList<>();
            for(int index : indexes){
                temp.add(strs[index]);
            }
            result.add(temp);
        }
        System.out.println(result);
        return result;
    }
}
