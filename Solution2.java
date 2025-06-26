class Solution2 {
    public boolean increasingTriplet(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(solution.increasingTriplet(nums1)); // Output: true

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println(solution.increasingTriplet(nums2)); // Output: false

        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println(solution.increasingTriplet(nums3)); // Output: true
    }
}
