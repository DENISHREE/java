
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev1 = 1;
        int prev2 = 2; 
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(2)); 
        System.out.println(solution.climbStairs(3)); 
        System.out.println(solution.climbStairs(4)); 
        System.out.println(solution.climbStairs(10)); 
    }
}
