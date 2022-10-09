import Animals.*;

public class Main {
    public static void main(String[] args) {
        NonFlyingBirds dodo = new NonFlyingBirds("Дади", 11, "Джунгли", "Наземный");
        NonFlyingBirds penguin = new NonFlyingBirds("Баби", 5, "Антарктида", "Наземный");
        NonFlyingBirds peacock = new NonFlyingBirds("Тати", 12, "Джунгли", "Наземный");

        FlyingBirds gull  = new FlyingBirds("Чача", 7, "Поборежье", "Наземный || Полёт");
        FlyingBirds albatross = new FlyingBirds("Альба", 4, "Поборежье", "Наземный || Полёт");
        FlyingBirds falcon = new FlyingBirds("Сосо", 7, "Пустыня", "Наземный || Полёт");

        Predators hyena = new Predators("Гиги", 3, "Саванна", 40, "Мясо");
        Predators tiger = new Predators("Тити", 5, "Джунгли", 45, "Мясо");
        Predators bear = new Predators("Бебе", 9, "Лес", 15, "Мясо");

        Herbivores gazelle = new Herbivores("Гага", 12, "Саванна", 50, "Трава");
        Herbivores giraffe = new Herbivores("Гиги", 6, "Саванна", 14, "Трава");
        Herbivores horse = new Herbivores("Хосе", 2, "Степь", 25, "Трава");

        Amphibians frog1 = new Amphibians("Фроги",2 , "Болото");
        Amphibians frog = new Amphibians("Фроги",2 , "Болото");
        Amphibians snake = new Amphibians("Снака",5 , "Болото");



        dodo.info();
        penguin.info();
        peacock.info();
        gull.info();
        albatross.info();
        falcon.info();
        hyena.info();
        tiger.info();
        bear.info();
        gazelle.info();
        giraffe.info();
        horse.info();
        frog.info();
        snake.info();


    }



}