package main.java.questions;

public class Q9 {
    public static void main(String args[]) {
        int x = 9;
//        boolean ans = isPalindrome(x);
        boolean answer = isPal(x);
        System.out.println(answer);
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if (x<10)
            return true;
        int reverse = 0;
        int num = x;
        while(x!=0) {
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        if (reverse == num) {
           return true;
        }
        return false;
    }

    //less complex approach
    public static boolean isPal(int x) {
        if(x<0 || (x!=0 && x%10==0))
            return false;
        int res = 0;
        while(x>res){
            res = res*10 + x%10;
            x = x/10;
        }
        return (x==res || x==res/10);
    }
}
