package Animals;

public abstract class Birds extends Animals{
    public Birds(String name, int age, String livingLocation) {
        super(name, age, livingLocation);
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
    public abstract void hunt();




}
