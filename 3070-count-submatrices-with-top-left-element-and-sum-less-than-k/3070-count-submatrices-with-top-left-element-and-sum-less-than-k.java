class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < col; i++){
            for(int j = 1; j < row; j++)
                grid[j][i] += grid[j - 1][i];
        }
        int count = 0;
        for(int i = 0; i < row; i++){
            int sum = grid[i][0];
            if(sum > k) break;
            for(int j = 1; j < col; j++){
                if(sum <= k)
                    count++;
                if(sum > k)
                    break;                
                sum += grid[i][j];
            }
            if(sum <= k)  
              count++;
        }
        return count;
    }
}