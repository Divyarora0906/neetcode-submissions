class Solution {
    public int lengthOfLongestSubstring(String s) {
      int windowStart = 0;
      int windowEnd = 0;
      int n= s.length();
      HashSet<Character> set = new HashSet<>();
      int MaxLength = Integer.MIN_VALUE;
      while(windowEnd < n){
        char ch = s.charAt(windowEnd);
        if(set.contains(ch)){
            while(windowStart < windowEnd && set.contains(ch)){
                set.remove(s.charAt(windowStart));
                windowStart++;
            }
        }
        set.add(ch);
        MaxLength = Math.max(MaxLength, windowEnd-windowStart+1);
        windowEnd++;
      }
      return (MaxLength==Integer.MIN_VALUE)?0:MaxLength;
    }
}
