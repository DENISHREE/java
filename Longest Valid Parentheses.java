import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); 
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); 
            } else {
                stack.pop(); 
                if (stack.isEmpty()) {
                    stack.push(i); 
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "(()";
        System.out.println("Output: " + sol.longestValidParentheses(s1)); 
        String s2 = ")()())";
        System.out.println("Output: " + sol.longestValidParentheses(s2)); 
        String s3 = "";
        System.out.println("Output: " + sol.longestValidParentheses(s3)); 
    }
}
