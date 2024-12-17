public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad")); 
        System.out.println(solution.strStr("leetcode", "leeto")); 
        System.out.println(solution.strStr("hello", ""));
    }
}
