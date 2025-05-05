package exeption_exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Write a number");
        long b = number.nextLong();
        try{
            if(b < 0){
                System.out.println("Invalid number");
            }else{
                double b1 = Math.sqrt(b);
                System.out.println(b1);
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid number");
        }finally {
            System.out.println("Good Bye");
        }
    }
}
