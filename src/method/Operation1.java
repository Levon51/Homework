package method;

public class Operation1 {

    /**
     * Sum and print two integers
     * @param a
     * @param b
     */
    public static void sumTwoIntegers(int a , int b) {
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(a-b);

    }



        public static void voidDouble(double c, double d) {

            System.out.println(c + d);
            System.out.println(c * d);
            System.out.println(c / d);
            System.out.println(c - d);
            System.out.println(c % d);
        }

        public static void sumInt() {
            int x = 2 * ((5 + 3) * 4 - 8);
            int y = 2 * 5 + 3 * 4 - 8;
            System.out.println(x);
            System.out.println(y);
        }

                                //Unary Operators

       public static void typeAll() {
           int e = 10;
           int f = -88;
           boolean n1 = true;
           int e1 = -e;
           int f1 = -f;
           int e2 = +e;
           int e3 = -e + 92;
           boolean n2 = !n1;
           boolean n3 = !(!n1);
           int $e = e++;
           int $f = --f;
           System.out.println(e1);
           System.out.println(f1);
           System.out.println(e2);
           System.out.println(e3);
           System.out.println(n2);
           System.out.println(n3);
           System.out.println($e);
           System.out.println($f);
           int p = 3;
           int o = ++p * 5 / p-- + --p;
           System.out.println("p is " + p);
           System.out.println("o is " + o);
       }

                            //Assignment Operator

       public static void typeAll2() {


           int x1 = (int) 1.0;
           System.out.println(x1);
           short y1 = (short) 1921222;
           System.out.println(y1);
           System.out.print(2147483647 + 1);
           long m = (x1 = 3);
           boolean nm = false;
           System.out.println(m);
       }
                                    //Relational Operators

      public static void typeRelationalOperation() {
          int $x = 10;
          int $y = 20;
          System.out.println($x < $y);
          System.out.println($x <= $y);
          System.out.println($x >= $y);
          System.out.println($x > $y);

      }                            //Additional  tasks
        public static void typeAddition() {
            float yy = 2.1f;

            byte xx = 5;
            byte y6 = 10;
            int z = xx + y6;
            System.out.println(z);

            short x0 = 10;
            short y0 = 3;
            int z0 = x0 * y0;
            System.out.println(z0);

            long _x = 10;
            int _y = 5;
            long type = _y * _x;
            System.out.println(type);
        }


    public static void main(String[] args) {
        sumTwoIntegers(8,6);
        voidDouble(6.4,0.03);
        sumInt();
        typeAll();
        typeAll2();
        typeRelationalOperation();

    }








}