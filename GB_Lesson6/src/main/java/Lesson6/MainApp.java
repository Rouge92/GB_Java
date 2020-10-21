package Lesson6;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Дружок");

        cat1.AnimalInfo();
        cat1.swim(40);
        cat1.run(30);
        cat1.jump(5.0);
        System.out.println("-----------------------------------------");
        dog1.AnimalInfo();
        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

    }
}