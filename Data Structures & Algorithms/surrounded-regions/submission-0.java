class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[rows][col];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(i == 0 || j == 0 || i == rows-1 || j == col-1){
                    if(board[i][j] == 'O'){
                        BoundaryDFS(board, rows, col, i, j, visited);
                    }
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(visited[i][j] == true){
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }
    }
    public void BoundaryDFS(char[][] board, int rows, int col, int i, int j, boolean[][] visited){
        if(i > rows-1 || i < 0 || j > col-1 || j < 0 || board[i][j] == 'X' || visited[i][j] == true){
            return;
        }
        System.out.println(board[i][j]);
        System.out.print(i+" "+j);
        visited[i][j] = true;
        BoundaryDFS(board, rows, col, i+1, j, visited);
        BoundaryDFS(board, rows, col, i-1, j, visited);
        BoundaryDFS(board, rows, col, i, j+1, visited);
        BoundaryDFS(board, rows, col, i, j-1, visited);
    }
}
