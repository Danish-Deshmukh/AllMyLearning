package section11Abstraction.Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard","big",70));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Fish("Shark","big",50));
        animals.add(new Fish("Pug","small",10));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }

    }
    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("Slow");
    }
}
