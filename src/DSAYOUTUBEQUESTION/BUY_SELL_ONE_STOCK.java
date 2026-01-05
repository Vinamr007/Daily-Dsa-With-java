package DSAYOUTUBEQUESTION;

public class BUY_SELL_ONE_STOCK {
    public static void main(String[] args) {
        int[] a={5,2,6,1,4};
        BUY_SELL_ONE_STOCK s=new BUY_SELL_ONE_STOCK();
        int p=s.maxprofit(a);
        System.out.println(p);
    }
    int maxprofit(int[] a){
        int maxprofit=0;
        int minsofar=a[0];
        for(int i=0;i<a.length;i++){
            minsofar=Math.min(minsofar,a[i]);
            int profit=a[i]-minsofar;
            maxprofit=Math.max(maxprofit,profit);

        }
        return maxprofit;
    }
}
