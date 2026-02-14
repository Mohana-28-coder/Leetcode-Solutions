class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        
        int[][] result = new int[m][n];
        
        int[] directions = {-1, 0, 1};
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                
                int sum = 0;
                int count = 0;
                
                for (int dr : directions) {
                    for (int dc : directions) {
                        int nr = r + dr;
                        int nc = c + dc;
                        
                        if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                            sum += img[nr][nc];
                            count++;
                        }
                    }
                }
                
                result[r][c] = sum / count; 
            }
        }
        
        return result;
    }
}
