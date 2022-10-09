package Animals;

import java.util.Objects;

public class NonFlyingBirds extends Birds{
    private String typeOfMoving;

    public String getTypeOfMoving() {return typeOfMoving;}
    public void setTypeOfMoving(String typeOfMoving) {this.typeOfMoving = typeOfMoving;}

    public NonFlyingBirds(String name, int age, String livingLocation, String typeOfMoving) {
        super(name, age, livingLocation);
        if (typeOfMoving == null || typeOfMoving.isBlank() || typeOfMoving.isEmpty()) {
            this.typeOfMoving = "<<default>>";
        } else {
            this.typeOfMoving = typeOfMoving;
        }
    }


    public void hunt() {
        System.out.println("Я умею охотится");
    }
    public  void walk(){
        System.out.println("Я не умею летать");
    }

    public void info() {
        super.info();
        System.out.println("Тип передвижения -> " + typeOfMoving);
    }



}
