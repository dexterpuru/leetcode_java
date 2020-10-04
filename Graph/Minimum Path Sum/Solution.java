public class Solution {

    //cache
    Map<String, Integer> cache = new HashMap<>();

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return -1;
        int rows = grid.length;
        int cols = grid[0].length;
        return minPathSum(grid, 0, 0, rows-1, cols-1);
    }

    private boolean isValidLocation(int currentRow, int currentCol, int[][] grid) {
        if (currentRow < 0 || currentRow >= grid.length || currentCol < 0 || currentCol >= grid[0].length) return false;
        return true;
    }

    private int minPathSum(int[][] grid, int currentRow, int currentCol, int endRow, int endCol) {
        if (!isValidLocation(currentRow, currentCol, grid)) return Integer.MAX_VALUE;

        String currentLocation = currentRow + "-" + currentCol;
        if (cache.get(currentLocation) != null) return cache.get(currentLocation);

        //destination is reached
        if (currentRow == endRow && currentCol == endCol) return grid[endRow][endCol];

        //minimum path sum to reach the destination by traversing right
        int minPathSumFromRight = minPathSum(grid, currentRow, currentCol+1, endRow, endCol);
        //minimum path sum to reach the destination by traversing down
        int minPathSumFromDown = minPathSum(grid, currentRow+1, currentCol, endRow, endCol);
        //pick the path with min value
        int minValue = Math.min(minPathSumFromDown, minPathSumFromRight);

        //store in cache
        cache.put(currentLocation, grid[currentRow][currentCol] + minValue);
        return grid[currentRow][currentCol] + minValue;
    }
}