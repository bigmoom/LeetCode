package datastructure;

/**
 *
 * 给定一个数组 prices
 * 它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票
 * 并选择在 未来的某一个不同的日子 卖出该股票。
 * 设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。
 * 如果你不能获取任何利润，返回 0 。
 *
 * @author cwh
 * @date 2021/8/16 11:48
 */
public class LeetCode121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    /**
     * 转换为求最大子序列和问题
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {

        int[] increament = new int[prices.length];
        increament[0] = 0;
        for (int i = 1; i < increament.length; i++) {
            increament[i] = prices[i] - prices[i - 1];
        }

        return maxSubArray(increament);


    }

    static int maxSubArray(int[] increament) {

        int ans =0;
        int sum = increament[0];

        for (int j : increament) {
            if (sum > 0) {
                sum += j;
            } else {
                sum = j;
            }
            ans = Math.max(ans, sum);
        }

        return ans;
    }

    //public int maxProfit(int[] prices) {
    //    if(prices.length <= 1)
    //        return 0;
    //    int min = prices[0], max = 0;
    //    for(int i = 1; i < prices.length; i++) {
    //        max = Math.max(max, prices[i] - min);
    //        min = Math.min(min, prices[i]);
    //    }
    //    return max;
    //}
}
