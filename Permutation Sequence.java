import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        int[] factorials = new int[n];
        factorials[0] = 1;
        for (int i = 1; i < n; i++) {
            factorials[i] = factorials[i - 1] * i;
        }
        List<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            digits.add(i);
        }
        k--;

        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int factorial = factorials[i - 1];
            int index = k / factorial;
            k %= factorial;

            sb.append(digits.get(index));
            digits.remove(index);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("The 3rd permutation of [1, 2, 3]: " + solution.getPermutation(3, 3)); 
        System.out.println("The 9th permutation of [1, 2, 3, 4]: " + solution.getPermutation(4, 9)); 
        System.out.println("The 1st permutation of [1, 2, 3]: " + solution.getPermutation(3, 1)); 
    }
}
