package interface_abstract_enum_exercises;

interface A{
    void methOne();
    void methSecond();
}
class MyClass implements A{
    public void methOne(){
        System.out.println("Print methOne ");
    }
    public void methSecond(){
        System.out.println("Print methSecond");
    }

    public static void main(String[] args) {
        MyClass nw = new MyClass();
        nw.methOne();
        nw.methSecond();
    }
}
