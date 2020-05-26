package concepts.examples.polymorphism;

// Java program for Runtime polymorphism / Dynamic binding / Method overridding
class Parent {

    void print() {
        System.out.println("parent class");
    }
}

class Mother extends Parent {

    void print() {
        System.out.println("Mother");
    }
}

class Father extends Parent {

    void print() {
        System.out.println("Father");
    }
}

class TestPolymorphism3 {
    public static void main(String[] args) {

        Parent a;

        a = new Mother();
        a.print();

        a = new Father();
        a.print();
    }
}

