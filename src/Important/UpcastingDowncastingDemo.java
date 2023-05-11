package Important;
//write a program to demostrate upcasting and downcating with real time example and appropriate method body
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        Animal animal = new Dog(); // upcasting
        animal.makeSound();

        Dog dog = (Dog) animal; // downcasting
        dog.wagTail();
    }
}

