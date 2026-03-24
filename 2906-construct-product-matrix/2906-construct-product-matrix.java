class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 12345;
        int[][] productMat = new int[m][n];
        long prefix = 1, suffix = 1;

        for(int i=0; i<m; i++) {
            Arrays.fill(productMat[i], 1);
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                productMat[i][j] = (int)(prefix * productMat[i][j]) % MOD;
                prefix = (prefix * grid[i][j]) % MOD;
                productMat[m-i-1][n-j-1] = (int)(suffix * productMat[m-i-1][n-j-1]) % MOD;
                suffix = (suffix * grid[m-i-1][n-j-1]) % MOD;
            }
        }

        return productMat;
    }
}