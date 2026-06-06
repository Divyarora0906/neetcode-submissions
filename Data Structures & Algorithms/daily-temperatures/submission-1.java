class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
      Stack<int[]> s = new Stack<>();
      for(int i = temperatures.length-1; i >= 0; i--){
        while (!s.isEmpty() && s.peek()[0] <= temperatures[i]) {
                s.pop();
        }
        if(s.isEmpty()){
            result[i] = 0;
        }
        else{
           result[i] = s.peek()[1] - i;
        }
        s.push(new int[]{temperatures[i],i});
      }
    return result;

    }
}
