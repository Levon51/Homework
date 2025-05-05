package inheritance;

import java.sql.SQLOutput;

/**
 * .     Create a class Parent which includes the method
 * showMessage() print “Hello Parent class ”.
 * Create a class Child which inherits from Parent and  override
 * showMessage() print “Hello Child class”.
 * <p>
 * Print both messages using only one object.
 */
class Parent {
    void showMessage() {
        System.out.println("Hello parent class");
    }
}

class Child extends Parent {
    void showMessage() {
        super.showMessage();
        System.out.println("Hello child class");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.showMessage();
    }
}

/**
 * .   Create a class SuperClass which includes the field
 * String message  =  “Hello SuperClass class ”.
 * Create a class SubClass which inherits from SuperClass and  has
 * String message = “Hello SubClass  class”.
 * <p>
 * Print both messages using only one object
 */
class SuperClass {
    String message = "Hello SuperClass class";
}

class SubClass extends SuperClass {
    String message = "Hello Subclass class";
}

class Main1 {
    public static void main(String[] args) {
        SubClass supra = new SubClass();
        System.out.println(supra.message);
        System.out.println(((SuperClass) supra).message);
    }
}

/**
 * Create a class of Car class which has the following
 * <p>
 * fields:
 * passengerCount //   it could not be less than 2
 * engineType // expected values  one letter (‘a-z , A-Z’)
 * <p>
 * methods: getter & setter of passengerCount & engineType fields
 * <p>
 * Create a subclass of Truck class which  has the following
 * <p>
 * fields:
 * capacity  // default value should be 0
 * <p>
 * methods:  getter & setter of capacity field
 * <p>
 * Use super(...) method in the constructor for initializing the fields of the superclass.
 */
class Cars {
    private int passengerCount;
    private char engineType;

    public Cars(int passengerCount, char engineType) {
        setPassengerCount(passengerCount);
        setEngineType(engineType);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount <= 2) {
            System.out.println("The count is low 2 or 2");
        } else {
            this.passengerCount = passengerCount;
        }
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if (Character.isLetter(engineType)) {
            this.engineType = engineType;
        } else {
            System.out.println("The letter must be A-Z, a-z");
        }
    }
}

class Truck extends Cars {
    private int capacity = 0;

    public Truck(int passengerCount, char engineType, int capacity) {
        super(passengerCount,engineType);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
class Main2 {
    public static void main(String[] args) {
        Truck tr = new Truck(4,'W',3000);
        System.out.println("Passenger count = " + tr.getPassengerCount());
        System.out.println("Engine type = " + tr.getEngineType());
        System.out.println("Capacity = " + tr.getCapacity());
    }
}