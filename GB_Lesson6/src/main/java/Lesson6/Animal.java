package Lesson6;

import java.util.Random;

public class Animal {
    protected String name;
    protected String who;
    protected double j;
    protected int s;
    protected int r;
    public Random random = new Random();

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
    public void AnimalInfo() {
        System.out.println(this.who + " " + this.name + " может бежать" + this.r + " м., плыть " + this.s + " м., прыгать " + this.j + " м.");
    }
    public void jump(double x) {
        if (this.j >= x) {
            System.out.println(this.who + " " + this.name + " подпрыгнул на  " + x + " метров");
        }
        else System.out.println(this.who + " " + this.name + " не смог на столько подпрыгнуть!");
    }
    public void swim(int x) {
        if (this.s >= x) {
            System.out.println(this.who + " " + this.name + " проплыл " + x + " метров");
        }
        else System.out.println(this.who + " " + this.name + " не смог столько проплыть!");
    }
    public void run(int x) {
        if (this.r >= x) {
            System.out.println(this.who + " " + this.name + " пробежал " + x + " метров");
        }
        else System.out.println(this.who + " " + this.name + " не смог столько пробежать!");
    }
    public static double ranDouble(){
        double leftLimit = 0.1;
        double rightLimit = 2.0;
        double genDouble = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);
        return genDouble;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.who = "Кот";
        this.j = ranDouble();
        this.r = random.nextInt(201);
    }
    @Override
    public void swim(int x) {
        System.out.println("Кот не умеет плавать!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.who = "Пес";
        this.j = ranDouble();
        this.s = random.nextInt(11);
        this.r = random.nextInt(501);
    }

}
