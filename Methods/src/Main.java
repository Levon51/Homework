
//Գրել մեթոդ, որը ունի երկու int մուտքային պարամետր և վերադարձնում է 0։
/*public class Main {

   public static int myMethod(int a, int b) {
        return 0;
    }
}

*/
//Գրել մեթոդ, որը չունի մուտքային պարամետրեր և ոչինչ չի վերադարձնում։
/*public class Main {
    public static void main(String[] args) {
        return ;
    }
}
*/


//Գրել մեթոդ, որը ունի boolean մուտքային պարամետր և տպում է "Hello World"։
/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

    }
}
*/


//Գրել մեթոդ, որը ունի char մուտքային պարամետր և վերադարձնում է այդ մուտքային պարամետրը։
/*public class Main {
    public static char returnChar(char c) {
        return c;
    }

    public static void main(String[] args) {
        char result = returnChar('A');
       System.out.println(result);
   }
*/

//Գրել մեթոդ, որը ունի երկու float մուտքային պարամետր և վերադարձնում է դրանցից մեկը
/*public class Main {
    public static float float_(float f, float f1) {
        return f1;

    }
    public static void main(String[] args) {
        float run = float_(76.1f,112.4f);
        System.out.print(run);
    }
}
*/


//Գրել մեթոդ, որը իր մարմնում ինքն իրեն է կանչում (ռեկուրսիա)։
public class Main {
    public static void recursion() {
        recursion();
    }
}