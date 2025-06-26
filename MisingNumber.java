class MisingNumber {
    public int misingnumber(int [] nums){
        int range = nums.length;
	
	int actualSum = (range * (range + 1)) / 2;
	int currentSum = 0;
	
	for (int i=0; i<nums.length; i++){
		currentSum = currentSum + nums[i];
		
	}
	int ans = actualSum - currentSum;
	return ans;
    }
    public static void main(String[] args) {
        MisingNumber misingNumberFinder = new MisingNumber();
        int[] nums1 = {3, 0, 1};
        System.out.println(misingNumberFinder.misingnumber(nums1)); // Output: 2

        int[] nums2 = {0, 1};
        System.out.println(misingNumberFinder.misingnumber(nums2)); // Output: 2

        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(misingNumberFinder.misingnumber(nums3)); // Output: 8
    }
}
