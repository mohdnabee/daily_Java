package recursionJAVA.BackTracking;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public  boolean isSafe(int row, int col , char [] [] board) {
        //  horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        //  vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        //upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }


        //upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public  void  saveBoard(char [][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBorad=  new ArrayList<>();

        for (int i=0;  i<board.length; i++){
            row= "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBorad.add(row);
        }

        allBoards.add(newBorad);
    }


public void helper(char [] [] board ,  List<List<String>> allBoards, int col){
    if(col == board.length) {
        saveBoard(board,allBoards );
        return;
    }

    for(int row=0; row<board.length; row++) {
        if(isSafe(row, col, board)) {
            board[row][col] = 'Q';
            helper(board, allBoards, col+1);
            board[row][col] = '.';
        }
    }
}

public  List<List<String>> solveNQueens(int n){
        List<List<String>> allBorads =  new ArrayList<>();
        char [] [] board =  new char[n][n];

        helper(board, allBorads,0);
        return allBorads;
}


        public static void main(String[] args) {

            Solution solution = new Solution();
            int n = 4; // You can change this to any size
            List<List<String>> results = solution.solveNQueens(n);

            for (List<String> board : results) {
                for (String row : board) {
                    System.out.println(row);
                }
                System.out.println(); // separate different board configurations


            }


        }}


