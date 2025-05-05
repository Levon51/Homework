package interface_abstract_enum_exercises;

abstract class Animals2 {
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals2{
    public void cats(){
        System.out.println("Cats are running");
    }
    public void dogs(){

    }
}
class Dogs extends Animals2{
    public void cats(){

    }
    public void dogs(){
        System.out.println("Dogs are Running");
    }

    public static void main(String[] args) {
        Animals2 cat = new Cats();
        Animals2 dog = new Dogs();
        cat.cats();
        dog.dogs();

    }
}

