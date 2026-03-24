class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;
        int MOD = 12345;

        long[] flat = new long[size];

        // Step 1: Flatten
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                flat[idx++] = grid[i][j] % MOD;
            }
        }

        // Step 2: Prefix
        long[] prefix = new long[size];
        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            prefix[i] = (prefix[i - 1] * flat[i - 1]) % MOD;
        }

        // Step 3: Suffix
        long[] suffix = new long[size];
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            suffix[i] = (suffix[i + 1] * flat[i + 1]) % MOD;
        }

        // Step 4: Build result
        int[][] result = new int[n][m];
        idx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long val = (prefix[idx] * suffix[idx]) % MOD;
                result[i][j] = (int) val;
                idx++;
            }
        }

        return result;
    }
}