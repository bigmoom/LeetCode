package dp;

/**
 * 泰波那契序列Tn定义如下：
 *
 * T0 = 0, T1 = 1, T2 = 1,
 * 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 * @author cwh
 * @date 2021/8/16 17:14
 */
public class LeetCode1137 {

    public int tribonacci(int n) {

        int T0 = 0;
        int T1 = 1;
        int T2 = 1;
        int Tn = 0;
        if (n == 0) {
            Tn = T0;
        } else if (n == 1 || n == 2) {
            Tn = T1;
        }else {
            for (int i = 3; i <= n; i++) {
                Tn = T0 + T1 + T2;
                T0 = T1;
                T1 = T2;
                T2 = Tn;
            }
        }
        return Tn;
    }
}
