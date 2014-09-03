public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1)   
        {
            return 0;
        }
        int low = prices[0];
        int maxp = 0;
        
        for(int price : prices)
        {
            int profit = price - low;
            if(profit > maxp) maxp = profit;
            if(price < low) low = price;
        }
        
        return maxp;
    }
}