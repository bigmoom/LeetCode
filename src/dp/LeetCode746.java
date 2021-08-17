package dp;

/**
 * 数组的每个下标作为一个阶梯，
 * 第 i 个阶梯对应着一个非负数的体力花费值cost[i]（下标从 0 开始）。
 *
 * 每当你爬上一个阶梯你都要花费对应的体力值，
 * 一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 *
 * 请你找出达到楼层顶部的最低花费。
 *
 * 在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 *
 * @author cwh
 * @date 2021/8/17 10:51
 */
public class LeetCode746 {

    public int minCostClimbingStairs(int[] cost) {

        int first = cost[0];
        if (cost.length == 1) {
            return first;
        }

        int second = Math.min(cost[0], cost[1]);
        if (cost.length == 2) {
            return second;
        }

        int result = 0;

        for (int i = 2; i < cost.length; i++) {
            if (i == 2) {
                first = 0;
            }
            result = Math.min(first + cost[i - 1], second + cost[i]);
            first = second;
            second = result;
        }
        return result;
    }
}
