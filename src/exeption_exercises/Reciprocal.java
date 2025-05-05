package exeption_exercises;

import java.util.Scanner;

public class Reciprocal {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Մուտքագրեք թիվ");
        try {
            int a = d.nextInt();
            if (a == 0) {
                throw new ArithmeticException("0 Թիվը չի կարող բաժանվել 0 ի ");
            }
            double c = (double) 1 / a;
            System.out.println("Հակադարձ թիվը = " + c);
        }catch (ArithmeticException e){
            System.out.println("Սխալ " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Մուտքագրեք ճիշտ թիվը");
        }
    }
}
