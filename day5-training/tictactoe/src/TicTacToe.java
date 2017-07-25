/**
 * Created by rasalp on 7/18/2017.
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] playBoard = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String next = scan.next();
                char ch = next.charAt(0);
                playBoard[i][j] = ch;
            }
        }
        char win = checkDiagonal(playBoard);
        if (win == 't')
            System.out.println("No one wins.");
        else
            System.out.println (win + " wins!");
    }

    public static char checkDiagonal(char[][] playBoard) {
        char ch = playBoard[0][0];
        for (int i = 1; i < playBoard[0].length; i++) {
            if (playBoard[i][i] != ch) {
                return 't';
            }
        }
        return ch;
    }

    public static char checkAntiDiagonal (char[][] playBoard) {
        int n = playBoard.length;
        char ch = playBoard[0][n - 1];
        for (int i = 1; i < playBoard[0].length; i++){}
        return ch;
    }
}
