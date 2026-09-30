class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][n] >= target) {
                return search(matrix[i], target);
            }
        }

        return false;
    }

    public boolean search(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid] == target) {
                return true;
            } 
            else if (matrix[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}