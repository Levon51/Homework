package enumes;

import org.w3c.dom.ls.LSOutput;

enum DayOfWeek{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    public boolean noWork(){
        return this == SATURDAY || this == SUNDAY;
    }
}
public class Enum {
    public static void main(String[] args) {
        for(DayOfWeek dd : DayOfWeek.values()){
            System.out.println(dd + " is " +(dd.noWork() ? "Weekend" : "Weekday" ));
        }
    }
}


enum TrafficLight {
    RED, YELLOW, GREEN;

    public TrafficLight getNextLight() {
        switch (this) {
            case RED: return GREEN;
            case GREEN: return YELLOW;
            case YELLOW: return RED;
        }
        return null;
    }
}

class TrafficDemo {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        for (int i = 0; i < 5; i++) {
            System.out.println("Current: " + light);
            light = light.getNextLight();
        }
    }
}


enum CoffeeSize {
    SMALL, MEDIUM, LARGE;
}

class CoffeeTest {
    public static void main(String[] args) {
        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs.name() + " - ordinal: " + cs.ordinal());
        }
    }
}
enum Planet {
    EARTH(5.97e24, 6371),
    MARS(6.42e23, 3389);

    double mass;
    double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public void showInfo() {
        System.out.println(this.name() + " Mass: " + mass + " kg, Radius: " + radius + " km");
    }
}
class Main {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            p.showInfo();
        }
        Planet.EARTH.mass = 100;
        System.out.println("\nAfter changing mass:");
        Planet.EARTH.showInfo();
    }
}
enum Operation{
        ADD {
            public double apply(double a, double b) {
                return a + b;
            }
        },
        SUBTRACT {
            public double apply(double a, double b) {
                return a - b;
            }
        },
        MULTIPLY {
            public double apply(double a, double b) {
                return a * b;
            }
        },
        DIVIDE {
            public double apply(double a, double b) {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;
            }
        };

        public abstract double apply(double a, double b);

}
class Main1 {
    public static void main(String[] args) {
        double x = 10;
        double y = 5;
        System.out.println("Addition: " + Operation.ADD.apply(x, y));
        System.out.println("Subtraction: " + Operation.SUBTRACT.apply(x, y));
        System.out.println("Multiplication: " + Operation.MULTIPLY.apply(x, y));
        System.out.println("Division: " + Operation.DIVIDE.apply(x, y));
    }
}
enum Currency{
    USD("$","United States Dollar"),
    EUR("€", "Euro"),
    JPY("¥", "Japanese Yen");
    String symbol;
    String country;

    Currency(String symbol,String country){
        this.symbol = symbol;
        this.country = country;
    }
    public String toString(){
        return this.name() + " - " + country;
    }
}
class Main2 {
    public static void main(String[] args) {
        for(Currency currency : Currency.values()){
            System.out.println(currency);
        }
    }
}
interface Drawable{
    void draw();
}
enum Shape implements Drawable{
    CIRCLE{
      public void draw(){
            System.out.println("Drawing a circle");
        }
    },
    SQUARE{
        public void draw(){
            System.out.println("Drawing a square");
        }
    },
    TRIANGLE{
        public void draw(){
            System.out.println("Drawing a triangle");
        }
    }
}
class Main3 {
    public static void main(String[] args) {
        for(Shape shp : Shape.values()){
            System.out.println(shp + ":");
            shp.draw();
        }
    }
}
enum SubscriptionPlan{
    FREE{
        public void monthlyCost(){
            System.out.println("Cost: 0 AMD");
        }
        public void benefits(){
            System.out.println("Benefits: Limited features, Ads included.");
        }
    },
    BASIC{
        public void monthlyCost(){
            System.out.println("Cost: 5000 AMD");
        }
        public void benefits(){
            System.out.println("Benefits: Basic features, No ads.");
        }
    },
    PREMIUM{
        public void monthlyCost(){
            System.out.println("Cost: 20000 AMD");
        }
        public void benefits(){
            System.out.println("Benefits: All features, Priority support.");
        }
    },
    ENTERPRISE{
        public void monthlyCost(){
            System.out.println("Cost: 50000 AMD");
        }
        public void benefits(){
            System.out.println("Benefits: Custom solutions, Dedicated account manager.");
        }
    };
    public abstract void monthlyCost();
    public abstract void benefits();
    public static void compareTo(SubscriptionPlan p, SubscriptionPlan p1){
        if(p.ordinal() > p1.ordinal()){
            System.out.println(p + " is a higher tier than " + p1);
        }else if(p1.ordinal() > p.ordinal()){
            System.out.println(p1 + " is a higher tier then " + p);
        }else{
            System.out.println(p1 + " and " + p + " are the same tier");
        }
    }
}
class Main4{
    public static void main(String[] args) {
        SubscriptionPlan sub = SubscriptionPlan.ENTERPRISE;
        sub.monthlyCost();
        sub.benefits();

        SubscriptionPlan.compareTo(SubscriptionPlan.PREMIUM,SubscriptionPlan.BASIC);
    }
}