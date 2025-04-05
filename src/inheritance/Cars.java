package inheritance;

/**
 * Create classes and use  inheritance(5  times)
 *    Example :   Bicycle ~ MotoBicycle,
 */
class Bmw {
    public void printCarName(){
        System.out.println("BMW M3 F80");
    }
}
class Car extends Bmw{
    public void printCarName(){
        super.printCarName();
    }
}
class Motorcycle {
    public void printMotoName(){
        System.out.println("Motorcycle YAMAHA");
    }
    public void printMotor1(){
        System.out.println("Motorcycle SUZUKI");
    }
}
class Motor extends Motorcycle{
    public void printMotoName(){
        super.printMotoName();
    }
}
class Motor1 extends Motorcycle{
    public void printMotoName(){
        super.printMotor1();
    }
}
public class Cars {
    public static void main(String[] args) {
        Motor a = new Motor();
        Motor1 b = new Motor1();
        Car c = new Car();
        b.printMotoName();
        a.printMotoName();
        c.printCarName();
    }
}