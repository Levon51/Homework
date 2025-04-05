package encapsulation;

class Car {
    private int passengerCount;
    private char engineType;


    public int getPassengerCount(){
        return  passengerCount;
    }
    public char getEngineType(){
        return  engineType;
    }

    public void setPassengerCount(int passengerCount){
        if(passengerCount>=2){
            this.passengerCount =  passengerCount;
        }
    }
    public void setEngineType(char engineType){
        if(engineType>='A' && engineType<='Z' || engineType>='a'&& engineType<='z'){
            this.engineType = engineType;
        }
    }

}
class Truck extends Car {
    private int capacity;

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){

    }
    public Truck( ){
        super.setEngineType('F');
        super.setPassengerCount(5);
    }
}
public class Main {
    public static void main(String[] args) {
        Truck car = new Truck();
        System.out.println("Engine type is "+car.getEngineType());
        System.out.println("Passenger count is "+car.getPassengerCount());
        System.out.println("Capacity is "+car.getCapacity());

    }
}
