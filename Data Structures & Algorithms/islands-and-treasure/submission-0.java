class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == 0){
                    queue.offer(new int[]{r, c});
                }
            }
        }
        int[][] direction = {{0,1}, {0,-1}, {1, 0},{-1, 0}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            for(int[] d: direction){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr >= 0 && nr < rows && nc >= 0 && nc < col && grid[nr][nc] == Integer.MAX_VALUE){
                    grid[nr][nc] = grid[r][c] + 1;
                    queue.offer(new int[]{nr , nc});
                }
            }

        }
    }
}
