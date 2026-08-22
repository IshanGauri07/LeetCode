class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int product = 1;

        for (int i = 0; i < n; i++){
            if( i > 0){
                product *= nums[i - 1];
            }
            ans[i] = product; 
        }
        product = 1;
        for(int i = n-1; i >= 0; i--){
            if(i < n-1){
                product *= nums[i + 1];
            }
            ans[i] = ans[i] * product;
        }
        return ans;
    }
}