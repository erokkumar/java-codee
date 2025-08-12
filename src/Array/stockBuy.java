package Array;

public class stockBuy {
    public int maxProfit(int [] price){
        int sum = 0;
        int n = price.length;
        for(int i = 0; i<n-1; i++){
            if(price[i] < price[i+1]){
                sum += price[i + 1] - price[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 6;

        int[] prices = {7,1,5,3,6,4};
        stockBuy obj = new  stockBuy();
        int profit = obj.maxProfit(prices);
        System.out.println("Maximum profit: " + profit);
    }
}
