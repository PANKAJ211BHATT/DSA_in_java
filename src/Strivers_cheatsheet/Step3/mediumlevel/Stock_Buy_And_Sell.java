package Strivers_cheatsheet.Step3.mediumlevel;

public class Stock_Buy_And_Sell {
    public static int stockBuyAndSell(int [ ] prices){
        int min_buying  = prices[0] ;
        int currentProfit = 0 ;
        int max_profit =0 ;

        for (int i = 1; i < prices.length; i++) {
            if (min_buying > prices[i]){
                min_buying = prices[i];
            } else {
                currentProfit = prices[i] - min_buying;
                max_profit = Math.max(currentProfit , max_profit);
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        // Sample array of stock prices
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Call your Stock Buy and Sell function
        int profit = stockBuyAndSell(prices);

        // Display the result
        System.out.println("Maximum profit: " + profit);
    }

}
