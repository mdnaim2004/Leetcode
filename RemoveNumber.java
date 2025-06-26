class RemoveNumber{
	public int removeElement(int [] nums,int val){
		int ptr = 0;
		for(int i = 0; i<nums.length; i++){
			if(nums[i] != val){
				nums[ptr] = nums[i];
				ptr++;
			}
		}
		return ptr;
	}
	public static void main(String[] args) {
        RemoveNumber obj = new RemoveNumber();

        int[] nums = {3, 2, 2, 3, 4, 2, 5};
        int val = 2;

        int newLength = obj.removeElement(nums, val);

        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}