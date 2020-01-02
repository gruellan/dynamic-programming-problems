class Solution {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int max = 0;
        int minPrice = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > minPrice){
                max = Math.max(max,prices[i]-minPrice);
            }
            else {
                minPrice = prices[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] input = {7,1,5,3,6,4};
        int expected = 5;
        int ans = maxProfit(input); 

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + ans);
    }
}