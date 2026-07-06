class Solution {
    public int numIslands(char[][] grid) {
        int isl = 0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
       for(int i = 0; i < grid.length; i++){
        for(int j = 0; j < grid[0].length; j++){
           if(grid[i][j] == '1' && !visited[i][j]){
                isl++;
                DFS(grid, i , j, visited);
           }
        }
       }
       return isl;
    }
    private void DFS(char[][] grid, int i, int j, boolean[][] visited){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length 
        || grid[i][j] == '0' || visited[i][j]) {
        return;
        }
        visited[i][j] = true;
        DFS(grid, i - 1, j, visited); // Up
    DFS(grid, i + 1, j, visited); // Down
    DFS(grid, i, j - 1, visited); // Left
    DFS(grid, i, j + 1, visited); // Right
        }

    }
