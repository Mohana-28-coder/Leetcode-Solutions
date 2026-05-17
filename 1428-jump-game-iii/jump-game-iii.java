class Solution {
    public boolean canReach(int[] arr, int start) {

        boolean[] visited = new boolean[arr.length];

        return dfs(arr, start, visited);
    }

    private boolean dfs(int[] arr, int index, boolean[] visited) {

        // Out of bounds or already visited
        if (index < 0 || index >= arr.length || visited[index]) {
            return false;
        }

        // Found zero
        if (arr[index] == 0) {
            return true;
        }

        visited[index] = true;

        int forward = index + arr[index];
        int backward = index - arr[index];

        return dfs(arr, forward, visited) ||
               dfs(arr, backward, visited);
    }
}