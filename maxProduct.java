class maxProduct {
    public int maxProduct(int []nums){
        int max = -1;
        int smax = -1;

        for(int i=0; i<nums.length; i++){
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
            }
            else if(smax < nums[i]){
                smax = nums[i];
            }
        }
        int ans = (max-1) * (smax-1);
        return ans;
    }
    public static void main(String[] args) {
        maxProduct mp = new maxProduct();
        int[] nums = {4,7,6,5,8,1};
        System.out.println(mp.maxProduct(nums));
    }
}
