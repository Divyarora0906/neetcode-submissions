class Solution {
    public boolean isPalindrome(String s) {
       String noSpaces = s.replace(" ", "");
       String pureAlpha = noSpaces.replaceAll("[^a-zA-Z0-9]", "");
       int i = 0;
       int j = pureAlpha.length()-1;
       System.out.println(pureAlpha);
       while(i < j){
        if(Character.toLowerCase(pureAlpha.charAt(i)) != Character.toLowerCase(pureAlpha.charAt(j))){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}
