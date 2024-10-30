package ArraysAndHashing;

import java.util.HashSet;

public class ValidSudoku {

    public boolean solution() {
        return isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet[] rows = new HashSet[9];
        HashSet[] cols = new HashSet[9];
        HashSet[] boxes = new HashSet[9];

        for (int i = 0 ; i < 9; i++) {
            rows[i] = new HashSet();
            cols[i] = new HashSet();
            boxes[i] = new HashSet();
        }

        for (int i = 0 ; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                if (rows[i].contains(board[i][j]) || cols[j].contains(board[i][j]) || boxes[(i/3)*3+(j/3)].contains(board[i][j])) {
                    return false;
                }

                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                boxes[(i/3)*3+(j/3)].add(board[i][j]);
            }
        }
        return true;
    }
}
