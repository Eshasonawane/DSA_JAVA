import java.util.*;

class Solution {

    // Check whether it is safe to place a queen
    public static boolean safeToPlace(char[][] board, int row, int col, int n) {

        // Check left side of current row
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Check lower-left diagonal
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void solve(char[][] board, int n, int colIndex,
                             List<List<String>> ans) {

        // Base case
        if (colIndex == n) {

            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        // Try placing queen in every row of current column
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {

            if (safeToPlace(board, rowIndex, colIndex, n)) {

                // Place queen
                board[rowIndex][colIndex] = 'Q';

                // Recursive call
                solve(board, n, colIndex + 1, ans);

                // Backtracking
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        solve(board, n, 0, ans);

        return ans;
    }
}