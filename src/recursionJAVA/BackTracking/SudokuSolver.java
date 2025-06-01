package recursionJAVA.BackTracking;
import java.util.Scanner;

public class SudokuSolver {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        // column check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }

        // row check
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }

        // grid check
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) return true;

        int nrow = (col == board.length - 1) ? row + 1 : row;
        int ncol = (col == board.length - 1) ? 0 : col + 1;

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');
                if (helper(board, nrow, ncol)) return true;
                board[row][col] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];

        System.out.println("Enter Sudoku board (use '.' for empty cells):");
        for (int i = 0; i < 9; i++) {
            String line;
            while (true) {
                System.out.print("Row " + (i + 1) + ": ");
                line = sc.nextLine().trim();
                if (line.length() == 9 && line.matches("[1-9.]{9}")) break;
                System.out.println("Invalid input. Enter exactly 9 characters using digits 1-9 or '.' for empty.");
            }
            board[i] = line.toCharArray();
        }

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        printBoard(board);
    }
}
