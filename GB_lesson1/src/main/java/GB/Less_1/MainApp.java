package GB.Less_1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int x1 = 5, x2 = 7, x3 = -3, x4 = -1;
        float a = 2.25f, b = 3.14f, c = 34.5f, d = 8.3f, calc;
        long c1 = 200000L;
        double d1 = -123.123;
        byte e = -120;
        boolean t = false;
        short h = 12442;
        char ch = '\u0000';
        String name = "Ksenia";

        calculate(a, b, c, d);
        task10and20(x1, x2);
        isPositiveOrNegative(x3);
        isNegative(x4);
        greetings(name);
    }

    public static float calculate(float a, float b, float c, float d) {
        float calc = a * (b + (c / d));
        System.out.println("Calculation is : " + calc);
        return calc;
    }

    public static boolean task10and20(int x1, int x2) {
        boolean t2 = false;

        if (x1 + x2 <= 20 && x1 + x2 >= 10) {
            t2 = true;
            System.out.println("Summ is in value : " + (x1 + x2));
        } else {
            t2 = false;
            System.out.println("Summ is not in value : " + (x1 + x2));
        }
        return t2;
    }

    public static void isPositiveOrNegative(int x3) {
        if (x3 >= 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }

    public static boolean isNegative(int x4) {
        if (x4 <= 0) {
            return true;
        }
        return false;
    }

    public static void greetings(String name) {
        System.out.println("Hello," + name + "!");
    }
}