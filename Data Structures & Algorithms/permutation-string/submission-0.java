class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lengthOfWindow = s1.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = 0;
        while(i < lengthOfWindow){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i), 0)+1);
            i++;
        }
        int left = 0;
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int right = 0; right < s2.length(); right++){
            char ch = s2.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(right-left+1 > lengthOfWindow){
                char leftChar = s2.charAt(left);
                map2.put(leftChar, map2.get(leftChar)-1);
                if(map2.get(leftChar)==0){
                    map2.remove(leftChar);
                }
                left++;
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}
