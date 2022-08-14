package main.java.questions;

import java.util.Arrays;

public class Q108 {
    public static void main(String[] args) {

    }

//    private static Object sortedArrayToBST(int[] nums) {
//        if (nums.length == 0) return null;
//        int mid = nums.length / 2;
//        TreeNode root = new TreeNode(nums[mid]);
//        int[] left = Arrays.copyOfRange(nums, 0, mid);
//        root.left = sortedArrayToBST(left);
//        int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);
//        root.right = sortedArrayToBST(right);
//        return root;
//    }
//    private TreeNode sortedArrayToBSTHelper ( int[] nums, int left, int right){
//        if (left > right) return null;
//        int mid = left + (right - left) / 2;
//        TreeNode root = new TreeNode(nums[mid]);
//        root.left = sortedArrayToBSTHelper(nums, left, mid - 1);
//        root.right = sortedArrayToBSTHelper(nums, mid + 1, right);
//        return root;
//    }
//    public TreeNode sortedArrayToBST2 ( int[] nums){
//        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
//    }
}

