class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int pair[] : edges){
            int u = pair[0];
            int v = pair[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int count = 0;
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                dfs(i, adj, visited);
            }
        }
        return count;
    }
    private void dfs(int i , ArrayList<ArrayList<Integer>> list, boolean[] visited){
        visited[i] = true;
        for(int neighbour : list.get(i)){
            if(!visited[neighbour]){
                dfs(neighbour, list, visited);
            }
        }
    }
}
