class Solution {
    public int majorityElement(int[] nums) {
        int count0 = 0;
        int count1 = 0;

        for (int num : nums){
            if (count1 == 0){
                count0 = num;
            }
            if (num == count0) {
                count1++;
            }
            else {
                count1--;
            }
        }
        return count0;
    }
}