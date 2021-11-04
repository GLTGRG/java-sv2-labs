package references.dog;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Max", 1, "black");
        Dog dog2 = new Dog("Rocky", 2,"brown");
        Dog dog3 = new Dog("Luna", 1, "White");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("red");

        System.out.println(dogs);

        Dog dog5 = new Dog("Bella", 4, "black");
        System.out.println(dog5);

        dog5 = dogs.get(1);
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.setColour("white");

        System.out.println(dogs);

        List<Dog> dogs2 = dogs;

        Dog dog7 = dog4;
        dog7.setColour("silver");

        System.out.println(dogs2);

        dog2.setColour("black");
        System.out.println(dogs2);

        dog2 = null;
        System.out.println(dogs2);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.setColour("yellow");

        System.out.println(dogs2);
    }
}
