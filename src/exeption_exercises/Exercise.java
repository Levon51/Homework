package exeption_exercises;

import java.util.Scanner;

class InvalidStringException extends Exception {
    public InvalidStringException(String message) {
        super(message);
    }
}

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Մուտքագրեք տեքստ: ");
        String str = input.nextLine();

        try {
            if (str == null || str.trim().isEmpty()) {
                throw new InvalidStringException("Տեքստը դատարկ է կամ սխալ է մուտքագրված։");
            }
            String upper = str.toUpperCase();
            System.out.println("Մեծատառ տարբերակ՝ " + upper);
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println("Շրջված տարբերակ՝ " + reversed);
            int vowelCount = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                }
            }
            System.out.println("Ձայնավորների քանակը՝ " + vowelCount);
        } catch (InvalidStringException e) {
            System.out.println("Սխալ: " + e.getMessage());
        }
    }
}

