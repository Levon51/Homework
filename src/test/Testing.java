package test;

//public class Testing {
//}
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow Meow!");
    }
}

// Օգտագործում
public class Testing {
    public static void main(String[] args) {
        Animal myAnimal = new Cat(); // Parent class, բայց աշխատում է երեխայի մեթոդը
        myAnimal.makeSound();
    }
}
