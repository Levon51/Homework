package specifires;

/**
 * Ստեղծիր դաս static մեթոդով, որը ընդունում է ամբողջ թվերի զանգված և վերադարձնում է նոր զանգված՝
 * պարունակելով միայն զույգ թվերը։ Օգտագործիր այդ մեթոդը այլ դասում՝ պատահական թվերի զանգվածից
 * զույգ թվերը զտելու համար։
 */
class Even {
    public static int[] array(int[] ab) {
        int[] result = new int[ab.length];
        int count = 0;
        for (int i = 0; i < ab.length; i++) {
            if (ab[i] % 2 == 0) {
                result[count++] = ab[i];
            }
        }
        return (result);
    }
}

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[]{2345326, 23523524, 121, 442, 667};
        int[] evens = Even.array(numbers);
        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i] + " ");

        }
    }
}
