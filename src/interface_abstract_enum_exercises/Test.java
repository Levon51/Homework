package interface_abstract_enum_exercises;

interface Test{
    int square(int x);
}
class Arithmetic implements Test{
    public int square(int x){
        return x*x;
    }
}
class TestToInt {
    public static void main(String[] args) {
        Arithmetic ar = new Arithmetic();
        System.out.println("Square 6 is a " + ar.square(6));
    }

}

