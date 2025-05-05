package interface_abstract_enum_exercises;

/**
 * 1.Create an abstract class 'Parent' with an abstract method message(). It has two subclasses ChildOne &
 * ChildSecond each having an override version of  message() method that prints "This is first subclass" and
 * "This is second subclass" respectively. Call the message()  by creating an object for each subclass.
 */
abstract class ParentClass{
    abstract void message();
}
 class ChildClass1 extends ParentClass{
    void message(){
        System.out.println("This is a first Child class");
    }
}
 class ChildClass2 extends ParentClass{
    void message(){
        System.out.println("This is a second Child class");
    }
}
class Main3{
    public static void main(String[] args) {
    ChildClass1 ch1 = new ChildClass1();
    ch1.message();
    ChildClass2 ch2 = new ChildClass2();
    ch2.message();
    }
}
/**
 * 3.Write a program to create interface A. In this interface we have two abstract methods methOne()
 * and methSecond(). Implements this interface in another class named MyClass.
 */
