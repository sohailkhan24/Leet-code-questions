package main.java.questions;

public class Q26 {
    public static void main(String args[]) {
        int[] arr = {1,1,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr) {
        if (arr.length==0) return 0;
        int j=0;
        for (int i=0; i<arr.length; i++)
            if (arr[i]!=arr[j])
                arr[++j]=arr[i];
        System.out.println(arr);
        return ++j;
    }
}
