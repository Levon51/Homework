package specifires;
import java.util.Random;
import java.util.Arrays;
class EvenFilter {
    public static int[] filterEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evens = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evens[index] = num;
                index++;
            }
        }

        return evens;
    }
}

public class SearchEven {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Նախնական զանգվածը: " + Arrays.toString(numbers));
        int[] evens = EvenFilter.filterEven(numbers);
        System.out.println("Զույգ թվերը: " + Arrays.toString(evens));
    }
}