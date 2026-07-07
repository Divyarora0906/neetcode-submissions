class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int Maxcount = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    Maxcount = Math.max(Maxcount, DFS(grid, visited, i, j));
                }
            }
        }
        return Maxcount;
    }
    public int DFS(int[][] grid, boolean[][] visited, int row, int col){
        if(row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1 || visited[row][col] || grid[row][col] == 0){
            return 0;
        }
        visited[row][col] = true;
        return 1 + DFS(grid, visited,row-1, col)
            + DFS(grid, visited,row, col+1)
            + DFS(grid, visited,row+1, col)
            + DFS(grid, visited,row, col-1);
    }
}
