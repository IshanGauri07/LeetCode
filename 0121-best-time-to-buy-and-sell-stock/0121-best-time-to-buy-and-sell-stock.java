class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int nums : prices ){
            if (nums < min){
                min = nums;
            }
            if (nums - min > profit) {
                profit = nums - min;
            }
        }   
        return profit;
    }
}