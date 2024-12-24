
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "Hello World";
        System.out.println("Length of the last word in s1: " + solution.lengthOfLastWord(s1)); 

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Length of the last word in s2: " + solution.lengthOfLastWord(s2)); 

        String s3 = "luffy is still joyboy";
        System.out.println("Length of the last word in s3: " + solution.lengthOfLastWord(s3));
    }
}
