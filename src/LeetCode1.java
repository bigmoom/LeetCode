import java.util.HashMap;

/**
 *
 给定一个整数数组 nums 和一个整数目标值 target，
 请你在该数组中找出 和为目标值 target  的那 两个 整数，
 并返回它们的数组下标。

 你可以假设每种输入只会对应一个答案。
 但是，数组中同一个元素在答案里不能重复出现。

 你可以按任意顺序返回答案
 * @author cwh
 * @date 2021/8/16 9:02
 */
public class LeetCode1 {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            HashMap<Integer,Integer> numInMap = new HashMap();
            for(int index=0; index<nums.length; index++){
                numInMap.put(nums[index],index);
            }

            for(int index=0; index<nums.length; index++){
                if(numInMap.containsKey(target-nums[index])){
                    if(index != numInMap.get(target - nums[index])){
                        result[0] = index;
                        result[1] = numInMap.get(target - nums[index]);
                        return result;
                    }
                }
            }
            return result;
        }
    }
}
