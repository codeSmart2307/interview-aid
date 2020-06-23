package oop_concepts.polymorphism;

// Java program for Compile-time polymorphism / Static binding / Method overloading
class Multiply {

    // Method with 2 parameter
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method with the same name but 3 parameter
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method with the same name but 2 double parameter
    static double multiply(double a, double b) {
        return a * b;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Multiply.multiply(2, 4));
        System.out.println(Multiply.multiply(2, 7, 3));
        System.out.println(Multiply.multiply(2.4, 7.5));
    }
}
