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
        System.out.println(countAndPrint(7));
        printThreeDigits();
        printArray();
        int[] a = {0, 4, 7, 0, 1, 0};
        printRemoveZero(a);
        int[] j = {0b010011011};
        printToBinary(j);
        int[][] b = new int[][]{
                {2, 0, 1, 1},
                {0, 7, 3, 6},
                {0, 3, 1, 4}};
        printIfStatements(b);
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
    public static void sumArrays() {
        int[] array1 = {1, 5, 6, 3, 6};
        int[] array2 = {9, 7, 5, 3, 1};
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j]);
        }
    }

    /**
     * . Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։
     */
    public static int countAndPrint(int k) {
        int[] array1 = {2, 4, 4, 5, 4};
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == k) {
                count++;
            }
        }
        return count;
    }

    /**
     * Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։
     * Եռյակներում թվերի դասավորությունը էական չէ
     */
    public static void printThreeDigits() {
        int[] array = {2, 3, 4, 5};
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    System.out.println(array[i] + " " + array[j] + " " + array[k]);
                }
            }
        }
    }

    /**
     * Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
     */
    public static void printArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 8; i > -1; i--) {
            System.out.println(array[i]);
        }

    }

    /**
     * Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:
     *
     * @param a
     */
    public static void printRemoveZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }

    }

    /**
     * Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված զանգված
     * և արտածել n  թվի 10-ական ներկայացումը:
     *
     * @param j
     */
    public static void printToBinary(int[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }

    }

    /**
     * ․ Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES,
     * եթե նրա բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում։
     *
     * @param b
     */
    public static void printIfStatements(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            int sum = 0;
            for (int j = 0; j < b[i].length; j++) {
                sum += b[i][j];
            }
            if (sum % 2 != 0) {
                System.out.println("NO");
                return;
            }

            System.out.println("YES");
        }
    }
}



