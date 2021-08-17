package dp;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 * @author cwh
 * @date 2021/8/17 10:34
 */
public class LeetCode70 {

    /**
     * 状态转移方程： climb(n) = climb(n-1) + climb(n-2)
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        int first = 1;
        int second = 2;

        if (n == 1) {
            return first;
        }
        if (n == 2) {
            return second;
        }

        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
