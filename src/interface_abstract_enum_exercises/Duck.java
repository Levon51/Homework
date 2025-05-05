package interface_abstract_enum_exercises;
interface Flyable {
    void fly();
}
interface SwimMable {
    void swim();
}
public class Duck implements Flyable, SwimMable{
    public void fly(){
        System.out.println("Flying dinosaur");
    }
    public void swim(){
        System.out.println("Swimming fish");
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
