package main.java.questions;

public class Q121 {
    public static void main(String args[]) {
        int[] prices = {7,6,4,3,1};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i=1; i<prices.length;i++) {
            for(int j=0;j<=i-1;j++) {
                int price = prices[i]-prices[j];
                if(price>max) {
                    max= price;
                }
            }
        }
        return max;
    }
}
