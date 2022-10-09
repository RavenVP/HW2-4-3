package Animals;

public class Amphibians extends Animals {
    public Amphibians(String name, int age, String livingLocation) {
        super(name, age, livingLocation);
    }

    public void eat() {
        System.out.println("Я могу есть ");
    }
    public void sleep() {
        System.out.println("Я могу спать");
    }
    public void move() {System.out.println("Я могу передвигаться");}
    public void hunt() {
        System.out.println("Я могу охотиться");
    }



}
