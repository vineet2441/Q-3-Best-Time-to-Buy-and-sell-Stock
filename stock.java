class Solution {
    public int maxProfit(int[] prices) {
        int cp=Integer.MAX_VALUE;
        int profit=0;
        int p=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            profit=prices[i]-cp;
            if(p<profit){
                p=profit;
            }

       }
        return p;
    }
}
