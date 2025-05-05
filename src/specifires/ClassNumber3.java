package specifires;

import java.util.Scanner;

public class ClassNumber3 {
    static int number = java.util.random.RandomGenerator.getDefault().nextInt(1, 100);

    public static void main(String[] args) {
        System.out.print("Գուշակիր թիվը 1 - 100 միջակայքում․ ");
        Scanner scanner = new Scanner(System.in);
         while (true) {
             int input = scanner.nextInt();
            if(input > number){
                System.out.println("The number is too high");
            }else if(input < number){
                System.out.println("The number is too low");
            }else{
                System.out.println("The number is correct");
                break;
            }
        }
    }
}
