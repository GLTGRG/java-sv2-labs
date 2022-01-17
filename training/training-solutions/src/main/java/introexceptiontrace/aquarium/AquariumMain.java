package introexceptiontrace.aquarium;


public class AquariumMain {

    public static void main(String[] args) {


        Aquarium aquarium = new Aquarium();


        Fish fish1 = new Fish("kárász", "zold");
        Fish fish2 = new Fish("keszek", "fekete");
        Fish fish3 = new Fish("cápa", "szürke");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);

        System.out.println(aquarium.getNumberOfFish());


    }
}