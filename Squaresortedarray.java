class Squaresortedarray {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;

        while(start <= end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];

            if(ss > es){
                ans[ptr] = ss;
                start++;
            }
            else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Squaresortedarray obj = new Squaresortedarray();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
