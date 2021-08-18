package datastructure;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素）
 * 返回其最大和。
 * @author cwh
 * @date 2021/8/13 17:24
 */
public class LeetCode53 {
    /**
     * 动态规划
     */
    class Solution {
        public int maxSubArray(int[] nums) {
            //当前搜寻的最大值
            int sum = nums[0];
            //最大值
            int ans = sum;
            for(int i = 1; i<nums.length; i++){
                if(sum > 0){
                    sum += nums[i];
                }else {
                    sum = nums[i];
                }
                ans = Math.max(sum, ans);
            }
            return ans;
        }
    }
}
