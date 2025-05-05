package exeption_exercises;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Գրեք առաջին թիվը");
        int a = number.nextInt();
        System.out.println("Գրեք երկրորդ թիվը");
        int b = number.nextInt();
        try{
            if(b <= 0){
                throw new ArithmeticException("Թիվը չի կարող բաժանվել 0 ի վրա");
            }else{
                int c = a / b;
                System.out.println(c);
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
