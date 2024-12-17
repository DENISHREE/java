import java.util.HashMap;
import java.util.Map;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example usage:
        int[] result1 = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        int[] result2 = twoSum(new int[] { 3, 2, 4 }, 6);
        int[] result3 = twoSum(new int[] { 3, 3 }, 6);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); 
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); 
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); 
    }
}
