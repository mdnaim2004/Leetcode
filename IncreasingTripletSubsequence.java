class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int frist = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i = 0;  i<nums.length; i++){
            int element = nums[i];

            if(frist >= element){
                frist = element;
            }
            else if(second >= element){
                second = element;

            }
            else{
                third = element;

                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(solution.increasingTriplet(nums)); // Output: true

        System.out.println("\n\n");

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println(solution.increasingTriplet(nums2)); // Output: false

        System.out.println("\n\n");

        int[] nums3 = {2, 1, 5, 0, 4, 6};
    }
}
