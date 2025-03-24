package string;

public class StringUtil {

    public static void main(String[] args) {
        stringConcatenation();
        stringLiteral();
        stringReverse();
        String line = "We are living in an yellow submarine. We don't  have anything";
        String token = "in";
        countString(line, token);
        String gg = "yellow";
        printStringAndStringBuilder(gg);
        capacityAndLength();
        deleteAllASymbols();
        String l1 = new String("We are living in an yellow submarine.We don't  have anything");
        printReplace(l1);
        String b1 = new String("We are living in an yellow submarine.We don't  have anything");
        findTheLongestWord(b1);
        String x1 = new String("We are living in an yellow submarine. We don't  have anything");
        findIndex(x1);
        int n = 9;
        String text = "Hi my name is Levon";
        printSubLine(text, n);
        StringBuilder text2 = new StringBuilder("Hi my name is Levon");
        int v = text2.length();
        printStringBuilderLine(text2, v);
        String sentence = "We, are, living, in an, yellow, submarine, We don't,  have anything";
        printLongestWord(sentence);
        String word = "test";
        notNull(word);
    }


    public static void exercises() {
        String str1 = "Animal";
        String str2 = "animal";
        int l = str1.length();
        System.out.println(l);
        boolean a = str1.endsWith("mal");
        char c = str1.charAt(5);
        System.out.println(c);
        boolean f = str1.contains("im");
        int t = str1.indexOf("m");
        System.out.println(t);
        String c1 = str1.trim();
        System.out.println(c1);
        String g = str1.substring(4);
        System.out.println(g);
        String d = str1.toLowerCase();
        System.out.println(d);
        String d1 = str1.toUpperCase();
        System.out.println(d1);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        StringBuilder sb = new StringBuilder("Animal");
        int b = sb.indexOf("al");
        System.out.println(b);
        int len = sb.length();
        System.out.println(len);
        char ch = sb.charAt(5);
        System.out.println(ch);
        sb.insert(4, "+");
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder().append("Animal");
        sb1.append(" - ").append(true);
        int s = sb1.charAt(7);
        System.out.println(s);
        sb1.delete(1, 3);
        sb1.deleteCharAt(8);
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("animal");
        sb2.reverse();
        sb2.toString();
        System.out.println(sb2);

        System.out.println("hello\nworld");
        System.out.println("hello\tworld");
        System.out.println("hello\bworld");
        System.out.println("hello\rworld");
        System.out.println("hello\fworld");
        System.out.println("hello\'world");
        System.out.println("hello\"world");
        System.out.println("hello\\world");
    }

    /**
     * Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
     * 1.1     “hello” , “world”
     * 1.2     1 , 2 , “hello”
     * 1.3     “1” , 2 , “hello”
     * 1.4     “hello”, 1 ,2, “world”
     */
    public static void stringConcatenation() {

        System.out.println("hello" + "world");
        System.out.println(1 + 2 + "hello");
        System.out.println("1" + 2 + "hello");
        System.out.println("hello" + 1 + 2 + "world");

    }

    /**
     * Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
     * actual:  “We are living in”
     * result:  We
     * are
     * living
     * in
     */
    public static void stringLiteral() {
        System.out.println("We\n Are\n Living\n In\n Sevan");

    }

    /**
     * Գրել method (reverse), որը  շուռ է տալիս String.
     * actual:   “sample”
     * result:  “elpmas”
     */
    public static void stringReverse() {
        StringBuilder reverse = new StringBuilder("sample");
        reverse.reverse();
        System.out.println(reverse);

    }

    /**
     * 4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
     * int countSubString(String line, String token)
     * token = “in”  ,    line =  “We are living in an yellow submarine. We don't  have anything”
     */
    public static void countString(String line, String token) {
        int count = 0;
        int line1 = line.indexOf(token);
        while (line1 != -1) {
            count++;
            line1 = line.indexOf(token, line1 + 1);
        }
        System.out.println(count);
    }

    /**
     * Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
     * Նույնը  խնդիրը   StringBuilder-ով.
     *
     * @param gg
     */
    public static void printStringAndStringBuilder(String gg) {
        String gh = gg.toUpperCase();
        System.out.println(gh);
        StringBuilder sb = new StringBuilder("green");
        String jj = sb.toString().toUpperCase();
        System.out.println(jj);
    }

    /**
     * Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի
     * երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
     */
    public static void capacityAndLength() {
        StringBuilder str = new StringBuilder("Armenia");
        str.append("*************");
        System.out.println(str);
    }

    /**
     * Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները. Նույնը խնդիրը  StringBuilder-ով.
     * actual:  “We are living in an yellow submarine. We don't  have anything”
     * result:  “We re living in n yellow submrine. We don't  hve nything”
     */
    public static void deleteAllASymbols() {
        StringBuilder str1 = new StringBuilder("We are living in an yellow submarine. We don't have anything");
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a') {
                str1.deleteCharAt(i);
            }
        }
        System.out.println(str1);
    }

    /**
     * Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.
     * actual:  “We are living in an yellow submarine. We don't  have anything”
     * result:  “We *re living in *n yellow subm*rine. We don't  h*ve *nything”
     *
     * @param l1
     */
    public static void printReplace(String l1) {
        String l2 = l1.replace("a", "*");
        System.out.println(l2);

    }

    /**
     * Գրել method, որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.
     * actual:  “We are living in an yellow submarine. We don't  have anything”
     * result:  submarine
     */
    public static void findTheLongestWord(String b1) {
        String[] b2 = b1.split("[^a-zA-Z0-9]+");
        String word = "";
        for (int i = 0; i < b2.length; i++) {
            if (word.length() < b2[i].length()) {
                word = b2[i];
            }
        }
        System.out.println(word);

    }

    /**
     * Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String x2 սիմվոլը.
     * actual:  String c = “a”  ,  “We are living in an yellow submarine. We don't  have anything”
     * result:  index 3
     *
     * @param x1
     */
    public static void findIndex(String x1) {
        String x2 = "a";
        for (int i = 0; i < x1.length(); i++) {
            if (x1.charAt(i) == 'a') {
                System.out.println("Index is " + x1.indexOf("a"));
                return;
            }
        }
    }

    /**
     * Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող
     * ենթատողը, օգտագործելով String. Նույնը խնդիրը  StringBuilder-ով.
     *
     * @param text
     * @param n
     */
    public static void printSubLine(String text, int n) {
        String text1 = text.substring(0, n);
        System.out.println(text1);
    }

    /**
     * Նույնը խնդիրը  StringBuilder-ով.
     *
     * @param v
     * @param text2
     */
    public static void printStringBuilderLine(StringBuilder text2, int v) {
        StringBuilder text3 = new StringBuilder(text2.substring(0, v));
        System.out.println(text3);
    }

    /**
     * Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը ․
     * actual:  “We, are, living, in an, yellow, submarine, We don't,  have anything”
     * result:    have anything
     *
     * @param sentence
     */
    public static void printLongestWord(String sentence) {
        String[] words = sentence.split(",");
        String word = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > word.length()) {
                word = words[i];
            }
        }
        System.out.println(word);
    }
    /**
     * Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․
     */
    public static void notNull(String word){
    if(word == "" && word == null){
        System.out.println("Wrong value!");
    }else{
        System.out.println(word);
    }
    }
}
