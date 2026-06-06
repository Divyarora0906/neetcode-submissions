class Solution {
    public int trap(int[] height) {
        int maxLeft[] = new int[height.length];
        int maxRigth[] = new int[height.length];
        int maxTempL = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++){ 
            if(height[i] > maxTempL){
                maxTempL = height[i];
            }
            maxLeft[i] = maxTempL;
        }
        int maxTempR = Integer.MIN_VALUE;
        for(int j = maxRigth.length-1; j >= 0; j--){
              if(height[j] > maxTempR){
                maxTempR = height[j];
            }
            maxRigth[j] = maxTempR;
        }
        int totalUnits = 0;
        int k = 0;
        while(k < height.length){
            int perPillar = Math.min(maxLeft[k], maxRigth[k]);
            int perUnitVal = perPillar - height[k];
            if(perUnitVal >= 0){
                totalUnits+=perUnitVal;
            }
            k++;
        }
            return totalUnits;
    }

}
