class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int s_max = -1;
        int maxIdx = 0;

        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                s_max = max;
                max = nums[i];
                maxIdx = i;
            }
            else if(s_max < nums[i]){
                s_max = nums[i];
            }
        }
        if(s_max * 2 <= max){
            return maxIdx;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        LargestNumberAtLeastTwiceOfOthers solution = new LargestNumberAtLeastTwiceOfOthers();
        int[] nums = {1, 2, 3, 4};
        int result = solution.dominantIndex(nums);
        System.out.println("The dominant index is: " + result);
    }
}