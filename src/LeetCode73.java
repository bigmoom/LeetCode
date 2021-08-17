import java.util.Arrays;

/**
 * 给定一个m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 *
 * 进阶：
 *
 * 一个直观的解决方案是使用 O(mn)的额外空间，但这并不是一个好的解决方案。
 * 一个简单的改进方案是使用 O(m+n) 的额外空间，但这仍然不是最好的解决方案。
 * 你能想出一个仅使用常量空间的解决方案吗？

 * @author cwh
 * @date 2021/8/17 9:51
 */
public class LeetCode73 {

    /**
     * 采用第一行和第一列记录非首行首列是否需要置0
     * 此外两个标记量标记首行和首列是否需要置0
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        boolean rowHasZero = false;
        boolean colHasZero = false;

        //判断首列是否需要置零
        for (int i = 0; i < rowLength; i++) {
            if(matrix[i][0] == 0){
                colHasZero = true;
            }
        }
        //判断首行是否需要置零
        for (int j = 0; j < colLength; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
            }
        }
        //非首行首列，如果包含0，则首行首列对应位置置0
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < colLength; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //首列置零
        for (int i = 0; i < rowLength; i++) {
            if(colHasZero){
                matrix[i][0] = 0;
            }
        }
        //首行置零
        for (int j = 0; j < colLength; j++) {
            if(rowHasZero){
                matrix[0][j] = 0;
            }
        }

    }
}
