package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * @author cwh
 * @date 2021/8/16 10:45
 */
public class LeetCode350 {

    public static void main(String[] args) {

    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> nums1Map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();

        for(int num: nums1){
            nums1Map.put(num, nums1Map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (nums1Map.containsKey(num) && nums1Map.get(num)>0) {
                list.add(num);
                nums1Map.put(num, nums1Map.get(num) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
