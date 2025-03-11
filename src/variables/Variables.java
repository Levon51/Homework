package variables;

public class Variables {

    public static void main(String[] args) {

        //1․ Ստեղծել 2 փոփոխական(byte a և byte b ),  վերագրել կամայական արժեքներ և տպել   console -ում․
        byte a = 20;
        byte b = 127;
        System.out.println(a);
        System.out.println(b);

        //2․ Ստեղծել 2 փոփոխական(short c և short d ),  վերագրել կամայական արժեքներ և տպել console -ում․
        short c = 32767;
        short d = -26478;
        System.out.println(c);
        System.out.println(d);

        //3․ Ստեղծել 2 փոփոխական(int e և int f ),  վերագրել կամայական արժեքներ և տպել console -ում
        int e = 2147483647;
        int f = -2147483648;
        System.out.println(e);
        System.out.println(f);

        //4․ Ստեղծել 2 փոփոխական(long g և long h ),  վերագրել կամայական արժեքներ և տպել console -ում․
        long g = -23123135;
        long h = 1325123555;
        System.out.println(g);
        System.out.println(h);

        //6. Ստեղծել 2  փոփոխական (byte և int ) , վերագրել կամայական արժեքներ 2-ական տեսքով  և տպել   console -ում․
        byte num = 0b1001;
        int num1 = 0b011001101;
        System.out.println(num);
        System.out.println(num1);

                                        //GROUP (Floating point number)

        //7․ Ստեղծել 2 փոփոխական(float j և float k ),  վերագրել կամայական արժեքներ և տպել console -ում
        float j = 753433.56f;
        float k = -35.3522f;
        System.out.println(j);
        System.out.println(k);

        //8․ Ստեղծել 2 փոփոխական(double l և double m ),  վերագրել կամայական արժեքներ և տպել console -ում․
        double l = -33287387232.234232322499d;
        double m = 0.1223d;
        System.out.println(l);
        System.out.println(m);

        //9.Տպել float և double  Max & Min  արժեքները;
        float num2 = 3.4028235E38f;
        System.out.println(num2);
        System.out.println(Float.MIN_VALUE);


        System.out.println(Double.MAX_VALUE);
        double num3 = 4.9E-324d;
        System.out.println(num3);

        //10 Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
        //    իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?
        float test = 34.567839023f;
        float test1 = 12.345f;
        float test2 = 8923.1234857f;
        float test3 = 3456.091f;

        double $test = 34.567839023d;
        double $test1 = 12.345d;
        double $test2 = 8923.1234857d;
        double $test3 = 3456.091d;
        //բոլորը կարող ենք վերագրել և float ին և double ին, որովհետև այս բոլոր թվերը (.) ամբողջ թվեր են իսկ այս տիպերը
        // պատկանում են ամբողջական դասին։

                                            //GROUP (Character)

        //11․ Ստեղծել 2 փոփոխական(char n և char o ) վերագրել կամայական արժեքներ և տպել   console -ում․
        char n = 'b';
        char o = '9';
        System.out.println(n);
        System.out.println(o);

        //12.1 Տպել char s = 77;  և char w = 109;  արժեքները;
        char s = 77;
        char w = 109;
        System.out.println(s);
        System.out.println(w);

        //12.2 Տպել ՛K՛ symbolը  բոլոր հնարավոր տարբերակներով
        char symbol = 75;
        char symbol1 = 0x004B;
        char symbol2 = 'K';
        System.out.println(symbol);
        System.out.println(symbol1);
        System.out.println(symbol2);

        //13․ Ստեղծել 2 փոփոխական(boolean p և boolean q ),
        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);

        //14. Ի՞նչ կտպի կոդի այս հատվածը և ինչու՞։
           // int year = 201l;
             //System.out.print (year);
        //այս կոդը error կտա քանի որ int ում թվից բացի գրվաց տառ, իսկ int ում թվից բացի ոչինչ չպետք է լինի անգամ ամբողջ
        //թիվ

        //15. Ստեղծել int aa  = 7 և long bb փոփոխականներ,
        //      կատարել Cast գործողություն  aa -> bbb  և տպել console -ում․
        int aa = 7;
        int bb = aa;
        System.out.println(aa);
        System.out.println(bb);

        //16. Ստեղծել int myInt  = 7 և double myDouble փոփոխականներ,
        //     կատարել Cast գործողություն  myInt -> myDouble  և տպել console -ում
        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        //17. Ստեղծել double dd = 9.78d և int ii փոփոխականներ,
        //      կատարել Cast գործողություն  dd -> ii  և տպել console -ում
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(dd);
        System.out.println(ii);


        //18. Ստեղծել int ff = 9999 և byte gg փոփոխականներ,
        //կատարել Cast գործողություն  ff -> gg  և տպել console -ում
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(ff);
        System.out.println(gg);

        //19․ Գտնել սխալը , ուղղել և տպել
        long max = 3123456789L;
        double tt = 1000.00d;
        char i ='i'; char jj='j'; char ij = 'i' + 'j';
        int ll = 8;
        long hh = 8;
        int nn = 10, mm = 11;
        m = n;
        System.out.println(max);
        System.out.println(tt);
        System.out.println(i);
        System.out.println(jj);
        System.out.println(ij);
        System.out.println(ll);
        System.out.println(hh);
        System.out.println(nn);













    }


    }



