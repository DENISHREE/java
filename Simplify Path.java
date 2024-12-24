import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.equals(".") && !part.isEmpty()) {
                stack.push(part);
            }
        }

        StringBuilder canonicalPath = new StringBuilder();
        while (!stack.isEmpty()) {
            canonicalPath.insert(0, "/" + stack.pop());
        }

        return canonicalPath.length() == 0 ? "/" : canonicalPath.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath("/home/")); 
        System.out.println(solution.simplifyPath("/home//foo/"));
        System.out.println(solution.simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println(solution.simplifyPath("/../")); // Output: "/"
        System.out.println(solution.simplifyPath("/.../a/../b/c/../d/./")); 
    }
}
