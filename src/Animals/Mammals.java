package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals{

    private int speedMoving;
    private String food;

    public int getSpeedMoving() {return speedMoving;}
    public void setSpeedMoving(int speedMoving) {this.speedMoving = speedMoving;}
    public String getFood() {return food;}
    public void setFood(String food) {this.food = food;}

    public Mammals(String name, int age, String livingLocation, int speedMoving, String food) {
        super(name, age, livingLocation);
        if (food == null || food.isBlank() || food.isEmpty()) {
            this.food = "<<default>>";
        } else {
            this.food = food;
        }
        if (speedMoving <= 0) {
            this.speedMoving = 1;
        } else {
            this.speedMoving = speedMoving;
        }
    }

    public void eat() {
        System.out.println("Я могу есть ");
    }
    public void sleep() {
        System.out.println("Я могу спать");
    }
    public void move() {
        System.out.println("Я могу передвигаться");
    }
    public abstract void walk();

    public void info() {
        super.info();
        System.out.println("Максимальная скорость -> " + speedMoving + "Км/ч");
        System.out.println("Рацион -> " + food);
    }


}
