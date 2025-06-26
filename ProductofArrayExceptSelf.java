public class ProductofArrayExceptSelf {
    public int[] producExceptSelf(int[] nums){
        int n = nums.length;
        int[] right = new int[n];
        int product = 1;

        for (int i = n - 1; i >= 0; i--) {
            product = product * nums[i];
            right[i] = product;
        }

        int[] ans = new int[n];
        int left = 1;
        for (int i = 0; i < n - 1; i++) {
            int val = left * right[i + 1];
            ans[i] = val;
            left = left * nums[i];
        }
        ans[n - 1] = left;
        return ans;
    }
    public static void main(String[] args) {
        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        int[] nums = {-1, 0, -3, 1};
        int[] result = obj.producExceptSelf(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }
       
    }
}
