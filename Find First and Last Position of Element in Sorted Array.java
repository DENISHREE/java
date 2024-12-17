
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid; 
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid; 
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = sol.searchRange(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); 
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = sol.searchRange(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); 
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = sol.searchRange(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}
