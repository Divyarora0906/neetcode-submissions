class Solution {
    private int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];

        for(int i = 0; i <= n; i++){
            parent[i] = i;
        }

        for(int[] edge: edges){
            if(!union(edge[0],edge[1])){
                return edge;
            }
        }

        return new int[0];
    }
    private int find(int i){
        if(parent[i] == i){
            return i;
        }
        return parent[i] = find(parent[i]);
    }
    private boolean union(int i , int j){
        int rootI = find(i);
        int rootJ = find(j);

        if(rootI == rootJ){
            return false;
        }
        parent[rootI] = rootJ;
        return true;
    }
}
