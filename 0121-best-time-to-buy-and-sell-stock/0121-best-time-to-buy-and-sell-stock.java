class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_value = prices[0];

        for(int i = 1; i< prices.length; i++)
        {
              if(prices[i] - min_value > max_profit)
                 max_profit = prices[i] - min_value;

             else if(prices[i] < min_value)
                       min_value = prices[i];
                     
        }

        return max_profit;
    }
}