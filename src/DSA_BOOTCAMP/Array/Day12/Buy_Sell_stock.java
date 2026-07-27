package DSA_BOOTCAMP.Array.Day12;

public class Buy_Sell_stock {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};

        int maxProfit = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                int profit = a[j] - a[i];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
