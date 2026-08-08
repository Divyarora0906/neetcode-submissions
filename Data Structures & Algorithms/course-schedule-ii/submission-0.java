class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            Graph.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int pair[] : prerequisites){
            int course = pair[0];
            int pre = pair[1];

            Graph.get(pre).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
         int[] answer = new int[numCourses];
        int index = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            answer[index++] = curr;
            for(int next: Graph.get(curr)){
                indegree[next]--;
                if( indegree[next] == 0){
                    q.add(next);
                }
            }
        }
        if(index != numCourses){
            return new int[0];
        }
        return answer;
    }
}
