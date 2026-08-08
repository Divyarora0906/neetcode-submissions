class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n - 1){
            return false;
        }

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int pair[] : edges){
            int u = pair[0];
            int v = pair[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[] = new boolean[n];
        if (!dfs(0, -1, graph, visited)) {
            return false;
        }

        for (boolean node : visited) {
            if (!node) {
                return false;
            }
        }
        return true;

    }
    private boolean dfs(
        int node, 
        int parent,
        ArrayList<ArrayList<Integer>> graph,
        boolean[] visited
    ){
        visited[node] = true;
        for(int neigh : graph.get(node)){
            if(neigh == parent){
                continue;
            }
            if(visited[neigh]){
                return true;
            }
            if (!dfs(neigh, node, graph, visited)) {
                return false;
            }
        }
        return true;
    }
}
