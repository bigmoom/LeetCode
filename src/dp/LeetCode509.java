package dp;

/**
 * 斐波那契数，通常用F(n) 表示，形成的序列称为 斐波那契数列 。
 * 该数列由0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0，F(1)= 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 *
 * @author cwh
 * @date 2021/8/16 17:06
 */
public class LeetCode509 {

    public int fib(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        if (n == 0) {
            return first;
        } else if (n == 1) {
            return second;
        }else {
            for (int i = 2; i <= n; i++) {
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}
