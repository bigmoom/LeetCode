package sort;

import java.util.Arrays;

/**
 * @author cwh
 * @date 2021/8/17 18:03
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 8, 2};
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort1(int[] arr) {


    }

    private static void swap(int[] arr, int i , int j) {

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
