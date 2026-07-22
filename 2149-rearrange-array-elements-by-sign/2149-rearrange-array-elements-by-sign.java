class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] array = new int [nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                array [posIndex] = nums[i];
                posIndex += 2;
            } else {
                array[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return array;
    }
}