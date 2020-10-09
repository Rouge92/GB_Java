package GB_Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do{
        Random random = new Random();
        int ran = random.nextInt(10);
        System.out.println(ran);
        for (int i = 3; i != 0; i--) {
            int d = getNumberFromScanner("Угадайте число в пределах от 0 до 9", 0, 9);
            if (d == ran) {
                System.out.println("Вы угадали!");
                break;
            } else {
                if (d > ran) {
                    System.out.println("Вы не угадали,загаданное число меньше.");
                } else {
                    System.out.println("Вы не угадали,загаданное число больше.");
                }
            }
        }
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
        } while (sc.nextInt() == 1);
    }
    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do{
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}
