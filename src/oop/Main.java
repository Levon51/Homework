package oop;


/**
 * Create a class Parent which includes the method showMessage() print “Hello Parent class ”.
 *     Create a class Child which inherits from Parent and  override showMessage() print “Hello Child class”.
 *    Print both messages using only one object
 */
 class Parent{
    public void showMessage(){
        System.out.println("Hello Parent class ");
    }
}
class Child extends Parent{
    public void showMessage(){
        super.showMessage();
        System.out.println("Hello Child class ");
    }
}
public class Main {
     public static void main(String[] args) {
         Parent p = new Child();
         p.showMessage();
     }
}