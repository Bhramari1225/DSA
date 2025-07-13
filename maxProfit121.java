public class maxProfit121 {
    public static int maxProfit(int prices[]){
        int maxProfit = 0;
        int lowest = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i]>lowest){
                int profit = prices[i] - lowest;
                maxProfit = Math.max(profit, maxProfit);
            }
            lowest = Math.min(prices[i], lowest);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
