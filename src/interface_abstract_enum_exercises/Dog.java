package interface_abstract_enum_exercises;
 abstract class Animal{
    public abstract void eat();
    public void breathe(){
        System.out.println("Breathe");
    }
}
 interface Pet{
     void play();
}

public class Dog extends Animal implements Pet{
     public void play(){
         System.out.println("Dog play with a girl");
     }
     public void eat(){
         System.out.println("Dog is eating");
     }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
        dog.breathe();
    }
}
