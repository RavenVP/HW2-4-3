package Animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;
    private String livingLocation;

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getLivingLocation() {return livingLocation;}
    public void setLivingLocation(String livingLocation) {this.livingLocation = livingLocation;}

    public Animals(String name, int age, String livingLocation) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "<<default>>";
        } else {
            this.name = name;
        }
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
        if (livingLocation == null || livingLocation.isBlank() || livingLocation.isEmpty()) {
            this.livingLocation = "<<default>>";
        } else {
            this.livingLocation = livingLocation;
        }
    }

    public void info() {
        System.out.println("");
        System.out.println("Кличка -> " + name);
        System.out.println("Возраст -> " + age + " лет");
        System.out.println("Обитает -> " + livingLocation);


    }


}
