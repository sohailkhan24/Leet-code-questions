package main.java.questions;

import java.util.Arrays;

public class Q242 {
    public static void main(String args[]) {
        String a = "anagram";
        String b = "nagaram";
        boolean ans = isAnagram(a, b);
        System.out.println(ans);
    }

    public static boolean isAnagram(String s, String t) {
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);
        return Arrays.equals(tCharArr, sCharArr);
    }
}
