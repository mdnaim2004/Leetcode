class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int ans[] = new int [2];
        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length; j++){

                if (i != j && nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] nums = {2, 4, 11, 3};
    int target = 6;

    TwoSum obj = new TwoSum();
    int[] ans = obj.twoSum(nums, target);

    System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

}