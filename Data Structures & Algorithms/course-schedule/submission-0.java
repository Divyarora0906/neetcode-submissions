class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean visited[] = new boolean[numCourses];
        boolean path[] = new boolean[numCourses];   
        for(int i = 0; i < prerequisites.length; i++){
            if(!visited[i]){
                if(isCycle(i, numCourses, visited, path, prerequisites)){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean isCycle(int src, int numCourses, boolean[] visited, boolean[] path,int[][] edges){
        visited[src] = true;
        path[src] = true;
        for(int i = 0; i < edges.length; i++){
            int v = edges[i][0];
            int u = edges[i][1];
            if(u == src){
                if(!visited[v]){
                   if(isCycle(v, numCourses, visited, path, edges)){
                    return true;
                   }
                }
                else if(path[v]){
                    return true;
                }
            }
        }
        path[src] = false;
        return false;
    }
}
