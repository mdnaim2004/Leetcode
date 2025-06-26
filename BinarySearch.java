class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target >= nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();

        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(nums1, 9));

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(nums2, 2)); 

        int[] nums3 = {5};
        System.out.println(solution.search(nums3, 5)); 
    }
}