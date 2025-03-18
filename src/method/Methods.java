package method;


public class Methods {
    /**
     * Write a method which has two input parameters: type  int and return 0
     *
     * @param a
     * @param i
     */
    public static void printInt(int a, int i) {
        System.out.print(i + " ");
        System.out.println(a);
    }

    /**
     * Write a method which has boolean input parameters  and print “Hello World”.
     *
     * @param b
     * @return
     */
    public static void printBoolean(boolean b) {
        System.out.println("Hello World");

    }

    /**
     * Write a method which has a char input parameter  and return this  input parameter.
     *
     * @param c
     */
    public static void printChar(char c) {
        System.out.println(c);
    }

    /**
     * 5.	Write a method which has  two float input parameters  and return  one of them
     *
     * @param f
     * @param f1
     */
    public static float printFloat(float f, float f1) {
        System.out.println(f);
        return f;

    }

    /**
     * Write a method which has  no input parameters   and returns nothing
     */
    public static void noReturn() {
        return;
    }

    /**
     * @param a
     * @param b
     */
    public static void typeByte(byte a, byte b) {

        System.out.println(a);
        System.out.println(b);
    }

    /**
     * @param y
     * @param u
     */
    public static void printShort(short y, short u) {
        System.out.println(y);
        System.out.println(u);
    }

    /**
     * @param q
     * @param w
     */
    public static void printInteger(int q, int w) {
        System.out.println(q);
        System.out.println(w);
    }


    public static void main(String[] args) {
        printInt(-45, 67);
        printBoolean(true);
        printChar('a');
        printFloat(72, 89);
        noReturn();
        byte a = 43;
        byte b = -128;
        printInt(a, b);
        short y = 442;
        short u = 11128;
        printShort(y, u);
        int q = 222222;
        int w = -2222222;
        printInteger(q, w);

    }
}