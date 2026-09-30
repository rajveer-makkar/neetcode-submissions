class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m - 1;

        // Find the possible row
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][n - 1] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // low is now the first row whose last element >= target
        if (low == m) {
            return false;
        }

        return search(matrix[low], target);
    }

    public boolean search(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid] == target) {
                return true;
            } else if (matrix[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}