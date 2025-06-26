import java.util.HashMap;

class FindLucky {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (hm.containsKey(element)) {
                hm.put(element, hm.get(element) + 1);
            } else {
                hm.put(element, 1);
            }
        }

        int ans = -1;

        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        FindLucky solution = new FindLucky();

        int[] arr1 = {2, 2, 3, 4};
        System.out.println(solution.findLucky(arr1)); // Output: 2

        int[] arr2 = {1, 2, 2, 3, 3, 3};
        System.out.println(solution.findLucky(arr2)); // Output: 3

        int[] arr3 = {5, 5, 5, 5};
        System.out.println(solution.findLucky(arr3)); // Output: -1
    }
}
