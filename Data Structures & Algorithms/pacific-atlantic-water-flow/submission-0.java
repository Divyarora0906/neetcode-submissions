class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> newList = new ArrayList<>();
        if(heights == null || heights.length == 0 || heights[0].length == 0){
            return null;
        }
        int rows = heights.length;
        int col = heights[0].length;
        int pacific[][] = new int[rows][col];
        int atlantic[][] = new int[rows][col];

        for(int i = 0; i < rows; i++){
            DFS(heights, i, 0, Integer.MIN_VALUE,pacific);
            DFS(heights, i , col-1, Integer.MIN_VALUE,atlantic);
        }
        for(int k = 0; k < col; k++){
            DFS(heights, 0 , k, Integer.MIN_VALUE,pacific);
            DFS(heights, rows-1, k, Integer.MIN_VALUE,atlantic);
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(pacific[i][j] == 1 && atlantic[i][j] == 1){
                    newList.add(Arrays.asList(i, j));
                }
            }
        }
        return newList;
        
    }
    private void DFS(int[][] heights, int rows,int col, int prev, int[][] reach){
        int r = heights.length;
        int c = heights[0].length;

        if(rows < 0 || rows >= r || col < 0 || col >= c || reach[rows][col] == 1 || heights[rows][col] < prev){
            return;
        }
        reach[rows][col] = 1;
        DFS(heights, rows+1 , col, heights[rows][col],reach);
        DFS(heights, rows-1 , col, heights[rows][col],reach);
        DFS(heights, rows , col+1, heights[rows][col],reach);
        DFS(heights, rows , col-1, heights[rows][col],reach);
    }
}
