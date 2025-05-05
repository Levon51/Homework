package interface_abstract_enum_exercises;

abstract class Parent{
    abstract void message();
}
class ChildOne extends Parent{
    public void message(){
        System.out.println("This is first subclass");
    }
}
class ChildSecond extends Parent{
    public void message(){
        System.out.println("This is second subclass");
    }

    public static void main(String[] args) {
        ChildOne child1 = new ChildOne();
        ChildSecond child2 = new ChildSecond();
        child1.message();
        child2.message();
    }
}
