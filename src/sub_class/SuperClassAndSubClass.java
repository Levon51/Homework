package sub_class;



/**
 * Create a class SuperClass which includes the field String message  =  “Hello SuperClass class ”.
 *     Create a class SubClass which inherits from SuperClass and  has String message = “Hello SubClass  class”.
 *     Print both messages using only one object
 */
class SuperClass{
    String message = "Hello SuperClass class";
    public void printMessage(){
        System.out.println(message);
    }
}
class SubClass extends SuperClass{
    String message = "Hello SubClass class";
    public void printMessage(){
        super.printMessage();
        System.out.println(message);
    }
}
public class SuperClassAndSubClass{
    public static void main(String[] args) {
        SubClass classes = new SubClass();
        classes.printMessage();
    }
}