import java.util.HashMap;

/**
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。
 * 如果数组中每个元素都不相同，则返回 false 。
 * @author cwh
 * @date 2021/8/13 16:57
 */
public class LeetCode217 {
    public static void main(String[] args) {
    }

    //public boolean containsDuplicate(int[] nums) {
    //    HashMap<Integer,Integer> numsInMap = new HashMap<>();
    //    for(int index=0; index<nums.length; index++){
    //        numsInMap.put(nums[index], index);
    //    }
    //    Boolean contain = false;
    //    for(int index=0; index<nums.length; index++){
    //        if(numsInMap.get(nums[index])!=index){
    //            contain = true;
    //        }
    //    }
    //    return contain;
    //}

    public boolean containsDuplicate(int[] nums){

        HashMap<Integer,Boolean> numsInMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numsInMap.containsKey(i)){
                return true;
            }else{
                numsInMap.put(nums[i],true);
            }
        }
        return false;
    }

}
