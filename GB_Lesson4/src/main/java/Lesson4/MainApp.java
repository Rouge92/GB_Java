package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static final Random rand = new Random();

    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1-3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    private static void aiStep() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    private static boolean checkLan(char sym) {
        boolean cols, rows;
        for (int col=0; col<3; col++) {
            cols = true;
            rows = true;
            for (int row=0; row<3; row++) {
                cols &= (field[col][row] == sym);
                rows &= (field[row][col] == sym);
            }
            if (cols || rows) return true;
        }

        return false;
    }
   private static boolean checkDia(char sym) {
        boolean right, left;
        right = true;
        left = true;
        for (int i=0; i<3; i++) {
            right &= (field[i][i] == sym);
            left &= (field[3-i-1][i] == sym);
        }

        if (right || left) return true;

        return false;
    }
    private static boolean checkWin(char sym) {
        return checkLan(sym) || checkDia(sym);
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("PLAYER WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("SKYNET WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW");
                break;
            }
        }

    }


}
