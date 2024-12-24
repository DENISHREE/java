
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        solve(solutions, new ArrayList<>(), n, 0, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return solutions;
    }

    private void solve(List<List<String>> solutions, List<String> board, int n, int row, boolean[] columns, boolean[] diagonals1, boolean[] diagonals2) {
        if (row == n) {
            solutions.add(new ArrayList<>(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            int diag1 = row - col + (n - 1);
            int diag2 = row + col;

            if (columns[col] || diagonals1[diag1] || diagonals2[diag2]) {
                continue;
            }
            char[] rowArray = new char[n];
            for (int i = 0; i < n; i++) {
                rowArray[i] = '.';
            }
            rowArray[col] = 'Q';
            String rowString = new String(rowArray);

            board.add(rowString);
            columns[col] = true;
            diagonals1[diag1] = true;
            diagonals2[diag2] = true;
            solve(solutions, board, n, row + 1, columns, diagonals1, diagonals2);
            board.remove(board.size() - 1);
            columns[col] = false;
            diagonals1[diag1] = false;
            diagonals2[diag2] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> result = solution.solveNQueens(4);
        System.out.println("Output for n = 4:");
        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
