class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int curr_max = nums[0];

        for(int i=1; i<nums.length; i++){

            if(nums[i-1] < nums[i]){
                curr_max =curr_max + nums[i];
            }
            else{
                max = Math.max(max, curr_max);
                curr_max = nums[i];
            }
        }
        max = Math.max(max, curr_max);
        return max;
    }
    public static void main(String[] args) {
        MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();

        int[] nums1 = {10, 20, 30, 5, 10, 50};
        System.out.println(solution.maxAscendingSum(nums1)); // Output: 65

        int[] nums2 = {10, 20, 30, 40, 50};
        System.out.println(solution.maxAscendingSum(nums2)); // Output: 150

        int[] nums3 = {12, 17, 15, 13, 10, 11, 12};
        System.out.println(solution.maxAscendingSum(nums3)); // Output: 33
    }
}