
class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= n - 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Can jump for nums1: " + solution.canJump(nums1)); 

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can jump for nums2: " + solution.canJump(nums2)); 
    }
}
