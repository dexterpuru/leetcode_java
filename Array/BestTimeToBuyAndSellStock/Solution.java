public class Solution {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int result = 0;
        int costPrice = prices[0];
        int index = 1;
        while (index < prices.length) {
            if (prices[index] < costPrice) {
                costPrice = prices[index];
            } else {
                result = Math.max(result, Math.abs(prices[index] - costPrice));
            }
            index++;
        }
        return result;
    }
    
}
