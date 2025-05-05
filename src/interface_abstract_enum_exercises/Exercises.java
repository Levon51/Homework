package interface_abstract_enum_exercises;

//public interface Exercises {

//}

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Starting car");
    }
    public void stop(){
        System.out.println("Stopped car");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}