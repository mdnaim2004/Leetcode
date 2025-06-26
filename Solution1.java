class Solution1 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max_cap = 0;

        while(start < end){
            int h = Math.min(height[start], height[end]);
            int width = end - start;
            int currentCap = h * width;

            max_cap = Math.max(currentCap, max_cap);
            
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max_cap;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height)); // Output: 49
    }
}