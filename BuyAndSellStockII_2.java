public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1)
        {
            return 0;
        }
        int len = prices.length;
        int res = 0;
        int i = 0;
        while(i < len)
        {
            int buy, sell;
            //Descending Range
            while(i+1 < len && prices[i+1] < prices[i]) i++;
            buy = i++;
            //Ascending Range
            while(i < len && prices[i] > prices[i-1]) i++;
            sell = i-1;
            res += prices[sell] - prices[buy];
        }
        return res;
    }
}