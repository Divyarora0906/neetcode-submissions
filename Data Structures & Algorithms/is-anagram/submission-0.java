class Solution {
    public boolean isAnagram(String s, String t) {
       char CharArray1[] = s.toCharArray();
       Arrays.sort(CharArray1);
       String sorted1 = new String(CharArray1);
       char CharArray2[] = t.toCharArray();
       Arrays.sort(CharArray2);
       String sorted2 = new String(CharArray2);
       if(sorted1.equals(sorted2)){
        return true;
       }
       return false;
    }
}
