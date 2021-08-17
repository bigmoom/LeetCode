/**
 * 请你判断一个9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字1-9在每一行只能出现一次。
 * 数字1-9在每一列只能出现一次。
 * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用'.'表示。
 *
 * @author cwh
 * @date 2021/8/17 9:13
 */
public class LeetCode36 {

    public boolean isValidSudoku(char[][] board){

        //存储当前行，当前列，当前所在box是否出现过该数字
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int boxIndex = (i / 3) * 3 + j / 3;
                    if (row[i][num] || column[j][num] || box[boxIndex][num]) {
                        return false;
                    }else {
                        row[i][num] = true;
                        column[j][num] = true;
                        box[boxIndex][num] = true;
                    }
                }
            }
        }
        return true;

    }


}


