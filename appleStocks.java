public class Solution {

    public static int getMaxProfit(int[] stockPrices) {

        // calculate the max profit

        int minPrice = stockPrices[0];
        int maxProfit = 0;

       for (int currentPrice : stockPrices) {

          // compare current with prev min
           minPrice = Math.min(minPrice, currentPrice);

           // current proft
           int potentialProfit = currentPrice - minPrice;

           // compare current with prev max profit
           maxProfit = Math.max(maxProfit, potentialProfit)
       }
        

        return maxProfit;
    }

}