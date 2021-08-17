import java.util.Arrays;
import java.util.Iterator;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2
 * 另有两个整数 m 和 n
 * 分别表示 nums1 和 nums2 中的元素数目
 *
 * 请你 合并 nums2 到 nums1 中
 * 使合并后的数组同样按 非递减顺序 排列
 *
 * 注意：
 * 最终，合并后数组不应由函数返回，而是存储在数组 nums1 中
 * 为了应对这种情况，
 * nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。
 * nums2 的长度为 n 。
 *
 * @author cwh
 * @date 2021/8/16 9:46
 */
public class LeetCode88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int index1 = 0;
        int index2 = 0;
        int indexCount = 0;
        int[] temp = new int[nums1.length];
        System.arraycopy(nums1,0,temp,0, nums1.length);
        while(n !=0 && index1 <= m && index2 <= n){
            if(index1==m && index2 < n){
                nums1[indexCount] = nums2[index2];
                index2++;
            }else if(index2 ==n && index1 < m){
                nums1[indexCount] = temp[index1];
                index1++;
            }else if(index1<m && temp[index1]<nums2[index2]){
                nums1[indexCount] = temp[index1];
                index1++;
            }else if(index2 <n) {
                nums1[indexCount] =nums2[index2];
                index2++;
            }else {
                break;
            }
            indexCount++;
        }
    }

    //class Solution {
    //    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //
    //        int[] temp = new int[nums1.length];
    //        int count = 0;
    //        System.arraycopy(nums1, 0, temp, 0, nums1.length);
    //        //Iterator<Integer> iterator1 = Arrays.stream(nums1).iterator();
    //        Iterator<Integer> iterator2 = Arrays.stream(nums2).iterator();
    //        Iterator<Integer> iterator3 = Arrays.stream(temp).iterator();
    //
    //
    //        while (iterator3.next() != null && iterator2.next() != null) {
    //            if (iterator3.next() < iterator2.next()) {
    //                nums1[count] = iterator3.next();
    //                count++;
    //            } else {
    //                nums1[count] = iterator2.next();
    //                count++;
    //            }
    //        }
    //    }
    //}
}
