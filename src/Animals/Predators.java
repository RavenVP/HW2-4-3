package Animals;

public class Predators extends Mammals{



    public Predators(String name, int age, String livingLocation, int speedMoving,String food) {
        super(name, age, livingLocation, speedMoving,food);

    }



    public void walk() {
        System.out.println("Я могу гулять");
    }
    public void hunt() {
        System.out.println("Я могу охотиться");
    }



}
