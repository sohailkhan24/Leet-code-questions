package main.java.questions;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Q1 {
    public static void main(String args[]) {
        int[] prices = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(prices, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<i;j++) {
                int targetValue= nums[i]+nums[j];
                if(target == targetValue){
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
        }
        return result;
    }
}
