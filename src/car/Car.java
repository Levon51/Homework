package car;

public class Car {
    public String model;
    public int modelNumber;
    public String color;
    public int currentSpeed;
    public boolean isEngineStart;
        Car(){

        }
    public void startEngine() {
        System.out.println(model);
        System.out.println(modelNumber);
        System.out.println(color);
        System.out.println(currentSpeed);
        System.out.println(isEngineStart);

    }

    public void stopEngine() {
    System.out.println(isEngineStart);
    }



    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Mercedes-Benz C";
        car.modelNumber = 230;
        car.color = "black";
        car.isEngineStart = true;
        car.startEngine();
        car.isEngineStart = false;
        car.stopEngine();
        Car car1 = new Car();
        car1.model = "Mercedes-Benz S";
        car1.modelNumber = 550;
        car1.color = "White";
        car1.isEngineStart = true;
        car1.startEngine();
        car1.isEngineStart = false;
        car1.stopEngine();




    }
}