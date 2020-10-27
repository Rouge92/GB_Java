package Lesson7;
import java.util.Scanner;
class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды.\n ");
    }

    public int fInfo() {
        return food;
    }
    public  void moreFood(int n) {
        food += n;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Мурка", 20),
                new Cat("Базилио", 10),
                new Cat("Багира", 5),
        };
        int s = 0;
        Plate plate = new Plate(30);
        while (plate.fInfo() != 0) {
            for (Cat i : cat) {
                while (!i.isFullness() && plate.fInfo() >= i.getAppetite()) {
                    i.eat(plate);
                    plate.info();
                }
            }
            for (Cat i : cat) {

                if (!i.isFullness()) {
                    System.out.printf(i.who() + " не наелся.\n ");
                } else {
                    System.out.println(i.who() + " сыт.\n ");
                    s += 1;
                    if (s == cat.length+1) {
                        System.out.printf("Все накормлены \n ");
                        plate.food = 0; //если все сыты,еду из тарелки убираем
                    }
                }
            }

            plate.info();
            System.out.println("Подсыпать еще еды? введите кол-во: \n ");
            plate.moreFood(new Scanner(System.in).nextInt());
            plate.info();
        }
    }
}
