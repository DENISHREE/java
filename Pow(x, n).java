public class Solution {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        long exp = n;
        if (n < 0) {
            x = 1 / x;
            exp = -exp;  
        }

        return power(x, exp);
    }
    private static double power(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        double x1 = 2.00000;
        int n1 = 10;
        System.out.println(myPow(x1, n1)); 
        double x2 = 2.10000;
        int n2 = 3;
        System.out.println(myPow(x2, n2)); 
        double x3 = 2.00000;
        int n3 = -2;
        System.out.println(myPow(x3, n3)); 
    }
}
