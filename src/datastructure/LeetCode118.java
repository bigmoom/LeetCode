package datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，
 * 生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，
 * 每个数是它左上方和右上方的数的和。
 * @author cwh
 * @date 2021/8/16 16:39
 */
public class LeetCode118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> preList = new ArrayList<>();
        preList.add(1);

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> currentList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i ) {
                    currentList.add(1);
                }else {
                    currentList.add(preList.get(j - 1) + preList.get(j));
                }
            }
            result.add(currentList);
            preList = currentList;
        }

        return result;
    }
}
