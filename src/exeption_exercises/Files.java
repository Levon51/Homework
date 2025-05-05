package exeption_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Գրեք ֆայլի անունը: ");
        String fileName = input.nextLine();
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;
            while (fileScanner.hasNext()) {
                fileScanner.next();
                wordCount++;
            }
            System.out.println("Ֆայլում բառերի քանակը՝ " + wordCount);

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ֆայլը գոյություն չունի կամ չի կարող բացվել։");
        }
    }
}
