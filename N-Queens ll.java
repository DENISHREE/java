
class Solution {
    public int totalNQueens(int n) {
        int[] count = new int[1];
        solve(count, n, 0, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return count[0];
    }

    private void solve(int[] count, int n, int row, boolean[] columns, boolean[] diagonals1, boolean[] diagonals2) {
        if (row == n) {
            count[0]++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int diag1 = row - col + (n - 1);
            int diag2 = row + col;

            if (columns[col] || diagonals1[diag1] || diagonals2[diag2]) {
                continue;
            }
            columns[col] = true;
            diagonals1[diag1] = true;
            diagonals2[diag2] = true;
            solve(count, n, row + 1, columns, diagonals1, diagonals2);
            columns[col] = false;
            diagonals1[diag1] = false;
            diagonals2[diag2] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.totalNQueens(4);
        System.out.println("Number of solutions for n = 4: " + result1); 

        int result2 = solution.totalNQueens(1);
        System.out.println("Number of solutions for n = 1: " + result2); 
    }
}
