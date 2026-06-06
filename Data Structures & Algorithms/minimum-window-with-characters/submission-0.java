class Solution {
    public String minWindow(String s, String t) {
      int n = s.length();
      int m = t.length();
      if(n < m) return "";

      int[] need = new int[128];
      int[] have = new int[128];

      int totalRChar = 0;
      for(int i = 0; i < m; i++){
        if(need[t.charAt(i)] == 0){
            totalRChar++;
        }
        need[t.charAt(i)]++;
      }
      int low = 0;
      int minLen = Integer.MAX_VALUE;
      int startIdx = -1;
      int havCount = 0;
      for(int high = 0;high < n;high++){
        char current = s.charAt(high);
        have[current]++;

        if(need[current] > 0 && have[current] == need[current]){
            havCount++;
        }
        while(havCount==totalRChar){
            int currentWindowLen = high-low+1;
            if(minLen > currentWindowLen){
                minLen = currentWindowLen;
                startIdx = low;
            }
            char leftChar = s.charAt(low);
            have[leftChar]--;
            if(need[leftChar] > 0 && have[leftChar] < need[leftChar]){
                havCount--;
            }
            low++;
        }
      }
      if(minLen == Integer.MAX_VALUE){
        return "";
      }
      return s.substring(startIdx, startIdx+minLen);
    }
}
