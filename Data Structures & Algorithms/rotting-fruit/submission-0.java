
class Solution {
    public int orangesRotting(int[][] grid) {
        int freshfruits = 0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int time = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    freshfruits++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty() && freshfruits > 0) {
            time++;
            int s = queue.size();
            while (s > 0) {
                int[] pair = queue.poll();
                int r = pair[0];
                int c = pair[1];

                for (int[] dir : directions) {
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];
                    if (isValid(newRow, newCol, row, col) && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        freshfruits--;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
                s--;
            }
        }

        return freshfruits == 0 ? time : -1;
    }

    private boolean isValid(int i, int j, int row, int col) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}