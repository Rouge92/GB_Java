package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public int getAppetite() {
        return appetite;
    }
    public String who() {
        return name;
    }
    public boolean isFullness() {
        return fullness;
    }
    public void eat(Plate p) {
        if (this.fullness) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            System.out.printf(this.name+ " съел "+this.appetite+" еды \n");
            this.fullness = true;
        }
    }
}
