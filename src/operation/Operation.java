package operation;

public class Operation {

    /**
     * Sum and print two integers
     * @param a
     * @param b
     */
    public static void sumTwoIntegers(int a , int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
                            //Arithmetic Operators

        int a = 8;
        int b = 6;
        sumTwoIntegers(a, b);
       // System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);

        //2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը
        double c = 6.4d;
        double d = 0.03d;
        System.out.println(c+d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c-d);
        System.out.println(c%d);

        //3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);

                                //Unary Operators

        //4․ Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը․
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

                            //Assignment Operator

        //5․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
        	int x1 = (int)1.0;
        	System.out.println(x1);
            short y1 = (short)1921222;
            System.out.println(y1);
            System.out.print(2147483647+1);
            long m = (x1=3);
             boolean nm = false;
             System.out.println(m);

                                    //Relational Operators

        //6․ Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը
        int $x = 10;
        int $y = 20;
        System.out.println($x < $y);
        System.out.println($x <= $y);
        System.out.println($x >= $y);
        System.out.println($x > $y);

                                    //Additional  tasks
        //7. Գտնե և ուղղել սխալը
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
}