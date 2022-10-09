package Animals;

public class Herbivores extends Mammals{

    public Herbivores(String name, int age, String livingLocation, int speedMoving, String food) {
        super(name, age, livingLocation, speedMoving, food);
    }


    public void walk() {
        System.out.println("Я могу гулять");
    }

    public void graze() {
        System.out.println("Я могу пастись");
    }



}
