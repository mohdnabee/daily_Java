package recursionJAVA.BackTracking;

public class sudokoBack {

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
        if (row == board.length) {
            return true;
        }

        int nrow = 0, ncol = 0;

        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

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
        char[][] board = {
                {'5', '3', '.',      '.', '7', '.',    '.', '.', '.'},
                {'6', '.', '.',      '1', '9', '5',    '.', '.', '.'},
                {'.', '9', '8',       '.', '.', '.',   '.', '6', '.'},
                {'8', '.', '.',       '.', '6', '.',   '.', '.', '3'},
                {'4', '.', '.',       '8', '.', '3',   '.', '.', '1'},
                {'7', '.', '.',       '.', '2', '.',   '.', '.', '6'},
                {'.', '6', '.',       '.', '.', '.',   '2', '8', '.'},
                {'.', '.', '.',       '4', '1', '9',   '.', '.', '5'},
                {'.', '.', '.',       '.', '8', '.',   '.', '7', '9'}
        };

        sudokoBack solver = new sudokoBack();
        solver.solveSudoku(board);
        System.out.println("Solved Sudoku:");
        printBoard(board);
    }
}
