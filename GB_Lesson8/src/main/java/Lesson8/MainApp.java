package Lesson8;

public class MainApp {

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        int x = 0;
        int y = n - 1;
        int ctr = 1;
        while (ctr <= n * n) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[x][i] == 0) {
                    arr[x][i] = ctr++;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i][y] == 0) {
                    arr[i][y] = ctr++;
                }
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[y][i] == 0) {
                    arr[y][i] = ctr++;
                }
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i][x] == 0) {
                    arr[i][x] = ctr++;
                }
            }

            x++;
            y--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}