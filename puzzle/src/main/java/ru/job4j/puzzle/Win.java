package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++)
            if (board[row][row] == 1) {
                if(monoHorizontal(board, row) || monoVertical(board, row)){
                    rsl = true;
                    break;
                }
            }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1){
                rsl = false;
                break;
            }
        }
         return rsl;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 1){
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}

