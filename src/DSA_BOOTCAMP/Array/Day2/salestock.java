package DSA_BOOTCAMP.Array.Day2;

public class salestock {

    public static int maxprofit(int[] prices) {
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }

            int profit=prices[i]-minprice;

            if(profit>maxprofit){
                maxprofit=profit;
            }
        }


        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxprofit(prices));
    }
}
