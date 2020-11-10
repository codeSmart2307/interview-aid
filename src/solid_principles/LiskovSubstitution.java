package solid_principles;

// ========================== START BAD EXAMPLE ===========================

//class Bird {
//    void fly() {
//        System.out.println("Flying");
//    }
//}

// Ducks are flying birds. Makes sense!
//class Duck extends Bird {}

// Ostriches are birds but they don't fly. ERROR!
//class Ostrich extends Bird {}

// ========================== END BAD EXAMPLE ==========================

// ========================== START GOOD EXAMPLE ==========================

class Bird {
    void eat() {
        System.out.println("Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class FlyingBird extends Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class FlightlessBird extends Bird {}

// This is fine because ducks can eat, walk AND fly
class Duck extends FlyingBird {}

// This is also fine because eventhough ostriches don't fly, they do eat and walk
class Ostrich extends FlightlessBird {}

// ========================== END GOOD EXAMPLE ==========================


public class LiskovSubstitution {
    public static void main(String[] args) {
        FlyingBird duck = new Duck();
        FlightlessBird ostrich = new Ostrich();
        duck.fly();
        ostrich.walk();
    }
}
