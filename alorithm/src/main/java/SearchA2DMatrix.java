/**
 * Created by F7753 on 5/26/16.
 * Write an efficient algorithm that
 * searches for a value in an m x n matrix.
 * This matrix has the following properties:
 *
 * [[1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]]
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        Boolean ret = false;
        for (int i = 0; i < matrix.length; i++) {
            ret = searchHorizon(matrix[i], target);
            if (ret)
                return ret;
        }

        return ret;
    }

    public boolean searchHorizon(int[] horizon, int target) {
        int start = horizon.length;
        for (int i = start - 1; i >= 0; i--) {

            if (horizon[i] == target) {
                return true;
            } else if (horizon[i] < target) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] test = new int[2][1];
        test[0][0] = 6;
        test[1][0] = 5;
        System.out.println(new SearchA2DMatrix().searchMatrix(test, 6));
    }
}
