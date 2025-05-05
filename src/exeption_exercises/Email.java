package exeption_exercises;

import java.util.Scanner;
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}

public class Email {
    public static void main(String[] args) {
        Scanner email = new Scanner(System.in);
        System.out.println("Input your email ");
        String e1 = email.nextLine();
        try{
            if(!e1.contains("@") || !e1.contains(".")){
                throw new InvalidEmailException("Email is not correct ");
            }else{
                System.out.println("Your email: " + e1);
            }
        }catch(InvalidEmailException e){
            System.out.println(e.getMessage());
        }

    }
}
