package inheritance;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create classes and use  inheritance(5  times)
 * Example :   Bicycle ~ MotoBicycle,
 */
class Bmw {
    public void printCarName() {
        System.out.println("BMW M3 F80");
    }
}

class Car extends Bmw {
    public void printCarName() {
        super.printCarName();
    }
}

class Motorcycle {
    public void printMotoName() {
        System.out.println("Motorcycle YAMAHA");
    }

    public void printMotor1() {
        System.out.println("Motorcycle SUZUKI");
    }
}

class Motor extends Motorcycle {
    public void printMotoName() {
        super.printMotoName();
    }
}

class Motor1 extends Motorcycle {
    public void printMotoName() {
        super.printMotor1();
    }
}

//public class Cars {
class Dolls {
    public void nested() {
        nested(2, true);
    }    //	g1

    public int nested(int level, boolean height) {
        return nested(level);
    }

    public int nested(int level) {
        return level + 1;
    }

    ;    //	g2

    public static void main(String[] outOfTheBox) {
        new Short((short) 4).longValue();
    }
}

interface Sphere {
    default String getName() { return "Unknown"; }
} abstract class Planet {
    abstract String getName();
}  class Mars extends Planet implements Sphere {
    public Mars() {
        super();
    }
    public String getName() { return "Mars"; }
    public static void main(final String[] probe) {
        System.out.print(((Planet)new Mars()).getName());
    }
}
interface SpeakDialogue { default int talk() { return 7; } }
interface SingMonologue { default int talk() { return 5; } }


