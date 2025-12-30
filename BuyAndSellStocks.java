public class BuyAndSellStocks {

    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 3, 2, 6, 5, 0, 7 };
        System.out.println(maxProfit(prices));
    }
}
