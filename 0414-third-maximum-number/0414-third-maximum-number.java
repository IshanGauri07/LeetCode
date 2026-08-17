class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == max || nums[i] == second || nums[i] == third) {
                continue;
            }

            if (nums[i] > max) {
                third = second;
                second = max;
                max = nums[i];

            } else if (nums[i] > second) {
                third = second;
                second = nums[i];

            } else if (nums[i] > third) {
                third = nums[i];
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) third;
    }
}

        


