package exeption_exercises;

import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Age {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Write your age");
        int a = age.nextInt();
        try{
            if(a < 0 || a > 120){
                throw new InvalidAgeException("The age isn't correct.");
            }else{
                System.out.println("Your age is: " + a);
            }
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
