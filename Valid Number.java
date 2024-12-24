
import java.util.regex.Pattern;

class Solution {
    public boolean isNumber(String s) {
        String regex = "^[+-]?((\\d+\\.\\d*)|(\\.\\d+)|(\\d+))(e[+-]?\\d+)?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isNumber("0")); 
        System.out.println(solution.isNumber("e")); 
        System.out.println(solution.isNumber(".")); 
        System.out.println(solution.isNumber("2")); 
        System.out.println(solution.isNumber("0089")); 
        System.out.println(solution.isNumber("-0.1")); 
        System.out.println(solution.isNumber("+3.14")); 
        System.out.println(solution.isNumber("4.")); 
        System.out.println(solution.isNumber("-.9")); 
        System.out.println(solution.isNumber("2e10")); 
        System.out.println(solution.isNumber("-90E3")); 
        System.out.println(solution.isNumber("3e+7")); 
        System.out.println(solution.isNumber("+6e-1")); 
        System.out.println(solution.isNumber("53.5e93")); 
        System.out.println(solution.isNumber("-123.456e789")); 
        System.out.println(solution.isNumber("abc")); 
        System.out.println(solution.isNumber("1a")); 
        System.out.println(solution.isNumber("1e")); 
        System.out.println(solution.isNumber("e3")); 
        System.out.println(solution.isNumber("99e2.5")); 
        System.out.println(solution.isNumber("--6")); 
        System.out.println(solution.isNumber("-+3")); 
        System.out.println(solution.isNumber("95a54e53")); 
    }
}
