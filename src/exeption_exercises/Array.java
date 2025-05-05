package exeption_exercises;

public class Array {
    public static void main(String[] args) {
        try{
            int x = 10/0;
            System.out.println(x);
        } catch(ArithmeticException e){
            System.out.println("Թիվը չի կարող բաժանվել 0 ի ");
        }
    }

}
