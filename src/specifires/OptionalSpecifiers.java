package specifires;

/**
 * 1.	Create a class with a private static field and a public static method that modifies the value
 * of the field. Write a test class to verify that the value of the field is correctly updated.
 */
class Private{
    private static int a = 4;
    public static void change(){
        a = 78;
    }
   public static int getA(){
        return a;
    }
}

public class OptionalSpecifiers {
    public static void main(String[] args) {
        System.out.println(Private.getA());
        Private.change();
        System.out.println(Private.getA());
    }
}