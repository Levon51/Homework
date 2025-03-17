package statements;

public class Statements {
    /**
     *
     */

    public static void printOddNumbers() {
        int x = 21434235;
        if (x > 21434234 && x < 21434236) {
            System.out.println("The given number is odd");

        } else {
            System.out.println("The given number is even");
        }
        /**
         *
         */
    }

    public static void printPositiveORNegativeNumbers() {
        int x = -78;
        if (x > 0) {
            System.out.println("The given number is positive");
        } else {
            System.out.println("The given number is negative");
        }
    }

    /**
     *
     */
    public static void printDivisibleNumbers() {
        int a = 35;
        if (a / 5 == 0 && a / 7 == 0) {
            System.out.println("The given number is Divisible");
        } else {
            System.out.println("The given number is Divisible");
        }
    }

    /**
     *
     */
    public static void printCheckNumber() {
        int c = 670;
        if (c >= 100 && c <= 999) {
            int n = (c / 10) % 10;


            if (n == 7) {
                System.out.println("The second digit is 7");
            } else {
                System.out.println("the second digit is not 7");
            }
        }
    }

    /**
     *
     */
    public static void findLargeNumber(){
        int a = 989;
        int b = 7652;
        int c = -43;
        if (a > 1000 && a < 9999 ) {
            System.out.println("Large number is " + a);
        }else if(b > 1000 && b < 9999 ) {
            System.out.println("Large number is " + b);
        }else if (c > 1000 && c < 9999){
            System.out.println("Large number is " + c);
        }else{
            System.out.println("Number is not found");
        }
    }

    /**
     *
     */
    public static void printNumbers(){
        int i = 200;
        while(i>1){
            i -= 1;
            System.out.println(i);
        }
    }

    /**
     *
     */
    public static void printFirstDigit(){
        int v = 48422;
        while(v>=10){
            v = v / 10;
            System.out.println(v);
        }
    }

    /**
     *Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը
     */
    public static void print(){
        int x = 1;
        int y = 0;
        while(x<5 && y<10){
            x ++;
            y ++;
            System.out.println(y+x);

        }
    }

    /**
     *Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։
     * (նահանջ է համարվում այն տարին որը բաժանվում է 4, բայց բացառություն է արվում այն
     * տարիների համար, որոնք 100-ի բաժանվող են։ Այդ տարիները նահանջ են միայն, եթե նաև բաժանվում են 400-ի։)
     */
    public static void checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " նահանջ տարի է։");
                } else {
                    System.out.println(year + " նահանջ չէ։");
                }
            } else {
                System.out.println(year + " նահանջ տարի է։");
            }
        } else {
            System.out.println(year + " նահանջ չէ։");
        }
    }

    /**
     * Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
     */
    public static void printSquare(){
        int i = 5;
        for(int j = 1; j < i; j++){
            for(int y= 0; y < i; y++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printOddNumbers();
        printPositiveORNegativeNumbers();
        printDivisibleNumbers();
        printCheckNumber();
        findLargeNumber();
        printNumbers();
        printFirstDigit();
        print();
        checkLeapYear(1999);
        checkLeapYear(780);
        checkLeapYear(2020);
        printSquare();
    }
}


