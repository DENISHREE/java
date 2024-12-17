import java.util.*;

public class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(result, nums, start + 1);
            swap(nums, start, i);  
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        System.out.println(permute(nums1));  
        int[] nums2 = {0, 1};
        System.out.println(permute(nums2));  
        int[] nums3 = {1};
        System.out.println(permute(nums3));  
    }
}
