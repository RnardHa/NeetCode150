package BinarySearch;

public class Search2DMatrix {
    public boolean solution() {
        return searchMatrix(new int[][]{
                {1, 2, 4, 8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}}, 40);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length * matrix[0].length;
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            int x = mid / matrix[0].length;
            int y = mid % matrix[0].length;
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
