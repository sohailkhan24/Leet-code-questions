package main.java.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q349 {
    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};
       int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean b = greaterLength(nums1, nums2);
        if (b) {
            return cal(nums1, nums2);
        }
        return cal(nums2, nums1);
    }
    public static int[] cal (int[] arr1, int[] arr2) {
        return Arrays.stream(arr2)
                .distinct()
                .filter(x -> Arrays.stream(arr1).anyMatch(y -> y == x))
                .toArray();

    }

    public static boolean greaterLength(int[] nums1, int[] nums2) {
        return nums1.length > nums2.length;
    }

}
