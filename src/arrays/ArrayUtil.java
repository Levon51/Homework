package arrays;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] n = {4, 3, -9, -3, 5, -5};
        printPositive(n);
        short[] s = {5, 1, 9};
        print(s);
        long[] l = {45674345, 297358629, 259375444};
        printLong(l);
        float[] f = {-32, 4555, 0, 45553, -2, 5, -90, 2};
        printFloatMinValue(f);
        sumArrays();
    }

    /**
     * Գրել method, որը տպում է int[] n  array-ի դրական տարրերը․
     *
     * @param n
     */
    public static void printPositive(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                System.out.println(n[i]);
            }
        }
    }

    /**
     * . Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
     * Օրինակ՝ ( 257 -> 752)․
     *
     * @param s
     */
    public static void print(short[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }

    /**
     * Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը
     *
     * @param l
     */
    public static void printLong(long[] l) {
        long m = Long.MIN_VALUE;
        for (int i = 0; i < l.length; i++) {
            if (l[i] > m) {
                m = l[i];
            }
        }
        System.out.println(m);
    }

    /**
     * Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը
     *
     * @param f
     */
    public static void printFloatMinValue(float[] f) {
        float v = Float.MAX_VALUE;
        for (int i = 0; i < f.length; i++) {
            if (f[i] < v) {
                v = f[i];
            }
        }
        System.out.println(v);
    }

    /**
     * Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ
     * գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։
     */
    public static void sumArrays(){
        int[] array1 = {1,5,6,3,6};
        int[] array2 = {9,7,5,3,1};
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j]);
        }
    }
}
