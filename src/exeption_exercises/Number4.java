package exeption_exercises;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);
        System.out.println("Գրեք ֆայլի անունը ");
        String s = file.nextLine();
        try{
            FileReader file2 = new FileReader(s);
            Scanner scan = new Scanner(file2);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("Այդպիսի ֆայլ գոյություն չունի");
        }finally {
            System.out.println("Ծրագիրն ավարտված է");
        }
    }
}
