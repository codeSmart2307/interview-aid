package design_patterns;

// Java implementation of Adapter pattern
interface Bird {
    // Birds implement Bird interface that allows them to fly and make sounds adaptee interface
    public void fly();

    public void makeSound();
}

class Sparrow implements Bird {
    // A concrete implementation of bird
    public void fly() {
        System.out.println("Flying");
    }

    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}

interface ToyDuck {
    // Target interface
    // Toy ducks dont fly they just make a squeaking sound
    public void squeak();
}

class PlasticToyDuck implements ToyDuck {
    public void squeak() {
        System.out.println("Squeak");
    }
}

class BirdAdapter implements ToyDuck {
    // You need to implement the interface your client expects to use.
    Bird bird;

    public BirdAdapter(Bird bird) {
        // We need reference to the object we are adapting
        this.bird = bird;
    }

    public void squeak() {
        // Translate the methods appropriately
        bird.makeSound();
    }
}

class Adapter {
    public static void main(String args[]) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
